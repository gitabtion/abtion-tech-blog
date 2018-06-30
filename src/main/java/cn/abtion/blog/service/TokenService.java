package cn.abtion.blog.service;

import cn.abtion.blog.common.Utils;
import cn.abtion.blog.domain.Token;
import cn.abtion.blog.mappers.TokenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author abtion
 * @since 2018/4/26 16:40
 * email abtion@outlook.com
 */
@Service
public class TokenService {
    @Autowired
    private TokenMapper tokenMapper;

    public static final int TOKEN_EXPIRE_TIME = 7200000;
    public static final boolean CHECK_EXPIRE = true;

    public String createToken(long userId,int client, String ip){
        Token currentToken = tokenMapper.getToken(userId,client);
        String newToken = Utils.createUUID();
        long currentTime = Utils.createTimestamp();
        if (currentToken!=null){
            currentToken.setUpdateAt(currentTime);
            currentToken.setExpiresAt(currentTime+TOKEN_EXPIRE_TIME);
            currentToken.setToken(newToken);
            tokenMapper.updateToken(currentToken);
        }else {
            Token token = new Token();
            token.setToken(newToken);
            token.setExpiresAt(currentTime+TOKEN_EXPIRE_TIME);
            token.setUserId(userId);
            token.setClient(client);
            token.setIp(ip);
            token.setCreateAt(currentTime);
            token.setUpdateAt(currentTime);
            tokenMapper.createToken(token);
        }

        return newToken;
    }

    public long checkToken(String token) {
        Token oldToken = tokenMapper.getTokenByStr(token);

        if (oldToken == null) {
            return -1;
        }
        if (CHECK_EXPIRE) {
            long currentTime = Utils.createTimestamp();
            if (oldToken.getExpiresAt() < currentTime) {
                System.out.println(oldToken);
                System.out.println(currentTime);
                return -1;
            }
        }
        return oldToken.getUserId();
    }

    public boolean deleteToken(String token) {
        return tokenMapper.deleteToken(token) == 1;
    }
}
