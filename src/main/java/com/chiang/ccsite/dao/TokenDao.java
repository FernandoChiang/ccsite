package com.chiang.ccsite.dao;


import com.chiang.ccsite.entity.Token;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public interface TokenDao {
    /*
    * 获取最新的token
    * */
    Token getLastToken();

    /*
    * 保存token信息
    * */
    void save(Token token);

}
