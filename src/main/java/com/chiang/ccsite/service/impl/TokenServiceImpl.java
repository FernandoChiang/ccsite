package com.chiang.ccsite.service.impl;

import com.chiang.ccsite.service.TokenService;
import com.chiang.ccsite.dao.TokenDao;
import com.chiang.ccsite.entity.Token;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
@Service
public class TokenServiceImpl implements TokenService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TokenDao tokenDao;

    @Override
    public Token getLastToken() {
        return tokenDao.getLastToken();
    }

    @Override
    public void save(Token token) {
        tokenDao.save(token);
    }
}
