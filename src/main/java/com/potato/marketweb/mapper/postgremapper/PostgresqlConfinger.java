package com.potato.marketweb.mapper.postgremapper;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.potato.marketweb.mapper.postgremapper",sqlSessionFactoryRef = "postgresqlSessionFactory")
public class PostgresqlConfinger {
    @Bean("postgresqlDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.postgredb")
    public DruidDataSource postgresqlDataSource(){
        return new DruidDataSource();
    }

    @Bean(name="postgresqlSessionFactory")
    public SqlSessionFactory postgresqlSessionFactory(@Qualifier("postgresqlDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name="postgresqlSessionTemplate")
    public SqlSessionTemplate postgresqlSessionTemplate(@Qualifier("postgresqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean(name="postgresqlDruidServlet")
    public ServletRegistrationBean<Servlet> postgresqlDruidServlet() {
        // 进行 druid 监控的配置处理
        ServletRegistrationBean<Servlet> srb = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/**");
        // 白名单
        srb.addInitParameter("allow", "");
        // 是否可以重置数据源
        srb.addInitParameter("resetEnable", "false");
        return srb;
    }

    @Bean(name="postgresqlFilterRegistrationBean")
    public FilterRegistrationBean<Filter> db1FilterRegistrationBean() {
        FilterRegistrationBean<Filter> frb = new FilterRegistrationBean<>();
        frb.setFilter(new WebStatFilter());
        // 所有请求进行监控处理
        frb.addUrlPatterns("/*");
        // 排除名单
        frb.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");
        return frb;
    }

}
