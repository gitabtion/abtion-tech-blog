package cn.abtion.blog.dto.request;

/**
 * @author abtion
 * @since 2018/7/2 11:42
 * email abtion@outlook.com
 */
public class CreateCommentRequest {
    private long essayId;
    private long userId;
    private String content;

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
}
