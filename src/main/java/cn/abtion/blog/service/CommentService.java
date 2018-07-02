package cn.abtion.blog.service;

import cn.abtion.blog.domain.Comment;
import cn.abtion.blog.mappers.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author abtion
 * @since 2018/7/2 11:27
 * email abtion@outlook.com
 */
@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> getCommentsByEssayId(long essayId){
        return new ArrayList<>(commentMapper.getCommentsByEssayId(essayId));
    }

    public boolean deleteComment(long id){
        return commentMapper.deleteComment(id)==1;
    }

    public boolean createComment(Comment comment){
        return commentMapper.createComment(comment)==1;
    }
}
