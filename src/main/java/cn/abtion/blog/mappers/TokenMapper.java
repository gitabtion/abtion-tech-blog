package cn.abtion.blog.mappers;

import cn.abtion.blog.domain.Token;
import org.apache.ibatis.annotations.Param;

/**
 * @author abtion
 * @since 2018/4/26 16:40
 * email abtion@outlook.com
 */
public interface TokenMapper {
    Token getToken(@Param("userId")long userId,@Param("client")int client);
    Token getTokenByStr(@Param("token")String token);
    void createToken(Token token);
    int updateToken(Token token);
    int deleteToken(String token);
}
