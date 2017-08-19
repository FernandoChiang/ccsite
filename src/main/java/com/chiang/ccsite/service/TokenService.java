package com.chiang.ccsite.service;


import com.chiang.ccsite.entity.Token;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public interface TokenService {

    /**
     * 获取最新的token
     * @return
     */
    public Token getLastToken();

    /**
     * 保存token信息
     * @param token
     */
    public void save(Token token);
}
