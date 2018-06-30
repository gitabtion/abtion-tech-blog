package cn.abtion.blog.domain;

/**
 * @author abtion
 * @since 2018/6/18 21:37
 * email abtion@outlook.com
 */
public class Essay extends Model {
    private long id;
    private long authorId;
    private String tag;
    private String name;
    private String content;
    private int flag;
    private long viewNum;

    public Essay() {
    }

    public Essay(long id, long authorId, String tag, String name, String content, int flag, long viewNum) {
        this.id = id;
        this.authorId = authorId;
        this.tag = tag;
        this.name = name;
        this.content = content;
        this.flag = flag;
        this.viewNum = viewNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public long getViewNum() {
        return viewNum;
    }

    public void setViewNum(long viewNum) {
        this.viewNum = viewNum;
    }
}
