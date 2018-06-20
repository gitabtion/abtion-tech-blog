package cn.abtion.blog.mappers;

import cn.abtion.blog.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

/**
 * @author abtion
 * @since 2018/6/18 21:20
 * email abtion@outlook.com
 */
public interface UserMapper {
    Collection<User> getAllUsers();
    User getUserById(long id);
    User getUserByName(String name);
    int createUser(User user);
    int updateUser(User user);
}
