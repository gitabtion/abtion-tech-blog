package cn.abtion.blog.domain;

/**
 * @author abtion
 * @since 2018/6/18 22:00
 * email abtion@outlook.com
 */
public class EssayViewNum extends Model {
    private long essayId;
    private long viewNum;

    public EssayViewNum(long essayId, long viewNum) {
        this.essayId = essayId;
        this.viewNum = viewNum;
    }

    public long getEssayId() {
        return essayId;
    }

    public void setEssayId(long essayId) {
        this.essayId = essayId;
    }

    public long getViewNum() {
        return viewNum;
    }

    public void setViewNum(long viewNum) {
        this.viewNum = viewNum;
    }
}
