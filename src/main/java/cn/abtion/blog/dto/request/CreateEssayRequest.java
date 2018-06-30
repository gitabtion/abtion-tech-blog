package cn.abtion.blog.dto.request;

/**
 * @author abtion
 * @since 2018/6/23 21:33
 * email abtion@outlook.com
 */
public class CreateEssayRequest {
    private String tag;
    private String name;
    private String content;
    private int flag;

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
}
