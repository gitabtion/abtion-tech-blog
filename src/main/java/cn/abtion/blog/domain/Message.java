package cn.abtion.blog.domain;

/**
 * @author abtion
 * @since 2018/6/18 21:43
 * email abtion@outlook.com
 */
public class Message extends Model{
    private long id;
    private long from;
    private long to;
    private String content;
    private long createAt;

    public Message(long id, long from, long to, String content, long createAt) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.content = content;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
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
