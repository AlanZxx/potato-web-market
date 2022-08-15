package com.potato.marketweb.service.postgres.impl;

import com.potato.marketweb.mapper.postgremapper.postMapper;
import com.potato.marketweb.service.postgres.Postgre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Postgre")
public class Postgreimpl implements Postgre {
    @Autowired
    postMapper postMapper;

    @Override
    public int getAllTest() {
        return postMapper.getAllTest();
    }
}
