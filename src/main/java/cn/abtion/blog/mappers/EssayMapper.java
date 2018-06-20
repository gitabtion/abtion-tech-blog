package cn.abtion.blog.mappers;

import cn.abtion.blog.domain.Essay;

/**
 * @author abtion
 * @since 2018/6/20 14:35
 * email abtion@outlook.com
 */
public interface EssayMapper {
    void createEssay(Essay essay);
    int updateEssay(Essay essay);
    int deleteEssay(int id);
}
