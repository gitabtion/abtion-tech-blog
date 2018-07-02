package cn.abtion.blog.domain;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * @author abtion
 * @since 2018/6/18 21:42
 * email abtion@outlook.com
 */
@Table(name ="comments")
public class Comment extends Model{
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 16,isKey = true,isAutoIncrement = true)
    private long id;
    @Column(name = "essay_id",type = MySqlTypeConstant.INT,length = 16)
    private long essayId;
    @Column(name = "user_id",type = MySqlTypeConstant.INT,length = 16)
    private long userId;
    @Column(name = "content",type = MySqlTypeConstant.CHAR,length = 200)
    private String content;
    @Column(name = "create",type = MySqlTypeConstant.INT,length = 16)
    private long createAt;
    @Column(name = "essay_id",type = MySqlTypeConstant.CHAR,length = 45)
    private String userName;
    @Column(name = "user_avatar",type = MySqlTypeConstant.CHAR,length = 100)
    private String userAvatar;


    public Comment() {
    }

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
}
