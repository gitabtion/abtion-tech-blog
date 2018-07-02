package cn.abtion.blog.service;

import cn.abtion.blog.domain.Essay;
import cn.abtion.blog.mappers.EssayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author abtion
 * @since 2018/6/22 19:00
 * email abtion@outlook.com
 */
@Service
public class EssayService {
    @Autowired
    private EssayMapper essayMapper;

    public Essay getEssay(long id) {
        return essayMapper.getEssay(id);
    }
    @Transactional
    public boolean updateEssay(Essay essay) {
        return essayMapper.updateEssay(essay) == 1;
    }
    @Transactional
    public boolean deleteEssay(long id) {
        return essayMapper.deleteEssay(id) == 1;
    }

    public List<Essay> getMostViewEssays(int num){
        return new ArrayList<>(essayMapper.getMostViewEssays(num));
    }

    public List<Essay> getUserEssays(int page,int size,long userId){
        return new ArrayList<>(essayMapper.getUserEssays(page,size,userId));
    }

    public boolean createEssay(Essay essay){
        return essayMapper.createEssay(essay)==1;
    }

    public List<String> getAllTags(long authorId){
        HashSet<String> tags = new HashSet<>(essayMapper.getAllTags(authorId));
        return new ArrayList<>(tags);
    }

    public List<Essay> getEssaysByTag(String tag){
        return new ArrayList<>(essayMapper.getEssaysByTag(tag));
    }

}
