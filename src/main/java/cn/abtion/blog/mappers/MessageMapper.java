package cn.abtion.blog.mappers;

import cn.abtion.blog.domain.Message;

/**
 * @author abtion
 * @since 2018/6/20 14:35
 * email abtion@outlook.com
 */
public interface MessageMapper {
    void createMessage(Message message);
    int deleteMessage(int id);
}
