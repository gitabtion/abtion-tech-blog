package cn.abtion.blog.mappers;

import cn.abtion.blog.domain.Essay;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;

/**
 * @author abtion
 * @since 2018/6/20 14:35
 * email abtion@outlook.com
 */
public interface EssayMapper {
    int createEssay(Essay essay);
    int updateEssay(Essay essay);
    int deleteEssay(long id);
    Essay getEssay(long id);
    Collection<Essay> getUserEssays(@Param("page")int page,@Param("size")int size,@Param("userId")long userId);
    Collection<Essay> getMostViewEssays(@Param("num")int num);
    Collection<String> getAllTags(@Param("authorId")long authorId);
    Collection<Essay> getEssaysByTag(@Param("tag")String tag);
}
