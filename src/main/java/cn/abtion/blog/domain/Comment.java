package cn.abtion.blog.domain;

/**
 * @author abtion
 * @since 2018/6/18 21:42
 * email abtion@outlook.com
 */
public class Comment extends Model{
    private long id;
    private long essayId;
    private long userId;
    private String content;
    private long createAt;

    public Comment(long id, long essayId, long userId, String content, long createAt) {
        this.id = id;
        this.essayId = essayId;
        this.userId = userId;
        this.content = content;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEssayId() {
        return essayId;
    }

    public void setEssayId(long essayId) {
        this.essayId = essayId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }
}
