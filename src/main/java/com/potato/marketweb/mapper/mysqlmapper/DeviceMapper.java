package com.potato.marketweb.mapper.mysqlmapper;

import com.potato.marketweb.bean.DeviceInfo;
import com.potato.marketweb.bean.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * DeviceMapper
 *
 * @author desktop_spdb
 * @date 2022-12-06 13:37:09
 */





@Mapper
public interface DeviceMapper {
    @Insert("INSERT INTO `zhouxx`.`device`  (os_version,board,hardware,snNumber_build,MANUFACTURER,brand,radio,model,cpu_abi,host,device_driver,fingerprint,bootimage_build_fingerprint,os_version_id,ro_build_date,ro_build_date_utc,ro_build_description,ro_build_fingerprint,build_version_sdk,bootimage_build_date,bootimage_build_date_utc,alarm_alert,notification_sound,ringtone,serialno_androidboot,product_build_date,product_build_date_utc,product_build_fingerprint,androidboot_vbmeta_digest,system_build_date,system_build_date_utc,system_build_fingerprint,system_ext_build_date,system_ext_build_date_utc,system_ext_build_fingerprint,vendor_build_date,vendor_build_date_utc,vendor_build_fingerprint,build_host,device_name,screen_width,screen_height,androidid,mi_health_id,gcbooster_uuid,key_mqs_uuid,ad_aaid,ro_boot_serialno,ro_serialno,insert_time)\n" +
            " VALUES\n" +
            "(#{os_version,jdbcType=VARCHAR},#{board,jdbcType=VARCHAR},#{hardware,jdbcType=VARCHAR},#{snNumber_build,jdbcType=VARCHAR},#{MANUFACTURER,jdbcType=VARCHAR},#{brand,jdbcType=VARCHAR},#{radio,jdbcType=VARCHAR},#{model,jdbcType=VARCHAR},#{cpu_abi,jdbcType=VARCHAR},#{host,jdbcType=VARCHAR},#{device_driver,jdbcType=VARCHAR},#{fingerprint,jdbcType=VARCHAR},#{bootimage_build_fingerprint,jdbcType=VARCHAR},#{os_version_id,jdbcType=VARCHAR},#{ro_build_date,jdbcType=VARCHAR},#{ro_build_date_utc,jdbcType=VARCHAR},#{ro_build_description,jdbcType=VARCHAR},#{ro_build_fingerprint,jdbcType=VARCHAR},#{build_version_sdk,jdbcType=VARCHAR},#{bootimage_build_date,jdbcType=VARCHAR},#{bootimage_build_date_utc,jdbcType=VARCHAR},#{alarm_alert,jdbcType=VARCHAR},#{notification_sound,jdbcType=VARCHAR},#{ringtone,jdbcType=VARCHAR},#{serialno_androidboot,jdbcType=VARCHAR},#{product_build_date,jdbcType=VARCHAR},#{product_build_date_utc,jdbcType=VARCHAR},#{product_build_fingerprint,jdbcType=VARCHAR},#{androidboot_vbmeta_digest,jdbcType=VARCHAR},#{system_build_date,jdbcType=VARCHAR},#{system_build_date_utc,jdbcType=VARCHAR},#{system_build_fingerprint,jdbcType=VARCHAR},#{system_ext_build_date,jdbcType=VARCHAR},#{system_ext_build_date_utc,jdbcType=VARCHAR},#{system_ext_build_fingerprint,jdbcType=VARCHAR},#{vendor_build_date,jdbcType=VARCHAR},#{vendor_build_date_utc,jdbcType=VARCHAR},#{vendor_build_fingerprint,jdbcType=VARCHAR},#{build_host,jdbcType=VARCHAR},#{device_name,jdbcType=VARCHAR},#{screen_width,jdbcType=VARCHAR},#{screen_height,jdbcType=VARCHAR},#{androidid,jdbcType=VARCHAR},#{mi_health_id,jdbcType=VARCHAR},#{gcbooster_uuid,jdbcType=VARCHAR},#{key_mqs_uuid,jdbcType=VARCHAR},#{ad_aaid,jdbcType=VARCHAR},#{ro_boot_serialno,jdbcType=VARCHAR},#{ro_serialno,jdbcType=VARCHAR},#{insert_time,jdbcType=VARCHAR})\n")
    int addDeviceInfo(DeviceInfo deviceInfo);
}
//
//table

//    CREATE TABLE `device`  (
//        `os_version` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '系统版本',
//        `board` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获取设备基板名称',
//        `hardware` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备硬件名称,一般和基板名称一样（BOARD）',
//        `snNumber_build` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `MANUFACTURER` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备制造商',
//        `brand` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获取设备品牌',
//        `radio` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '无线电固件版本',
//        `model` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获取手机的型号 设备名称。如：SM-N9100（三星Note4）',
//        `cpu_abi` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获取设备指令集名称（CPU的类型）',
//        `host` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备主机地址',
//        `device_driver` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '获取设备驱动名称',
//        `fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备的唯一标识。由设备的多个信息拼接合成。',
//        `bootimage_build_fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `os_version_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '设备版本号。',
//        `ro_build_date` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ro_build_date_utc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ro_build_description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ro_build_fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `build_version_sdk` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `bootimage_build_date` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `bootimage_build_date_utc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `alarm_alert` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `notification_sound` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ringtone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `serialno_androidboot` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `product_build_date` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `product_build_date_utc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `product_build_fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `androidboot_vbmeta_digest` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `system_build_date` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `system_build_date_utc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `system_build_fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `system_ext_build_date` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `system_ext_build_date_utc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `system_ext_build_fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `vendor_build_date` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `vendor_build_date_utc` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `vendor_build_fingerprint` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `build_host` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `device_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `screen_width` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `screen_height` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `androidid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `mi_health_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `gcbooster_uuid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `key_mqs_uuid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ad_aaid` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ro_boot_serialno` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `ro_serialno` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
//        `insert_time` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '插入时间'
//        ) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;
//
//        SET FOREIGN_KEY_CHECKS = 1;