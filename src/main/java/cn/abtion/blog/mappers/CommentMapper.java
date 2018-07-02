package cn.abtion.blog.mappers;

import cn.abtion.blog.domain.Comment;

import java.util.Collection;

/**
 * @author abtion
 * @since 2018/6/20 14:35
 * email abtion@outlook.com
 */
public interface CommentMapper {
    int createComment(Comment comment);
    Collection<Comment> getCommentsByEssayId(long essayId);
    int deleteComment(long id);
}
