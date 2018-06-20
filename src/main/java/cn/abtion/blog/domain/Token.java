package cn.abtion.blog.domain;

/**
 * @author abtion
 * @since 2018/4/26 16:28
 * email abtion@outlook.com
 */
public class Token extends Model {
    private long userId;
    private int client;
    private String ip;
    private String token;
    private long createAt;
    private long updateAt;
    private long expiresAt;

    public long getUserId() {
        return userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getClient() {
        return client;
    }

    public void setClient(int client) {
        this.client = client;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    public long getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(long expiresAt) {
        this.expiresAt = expiresAt;
    }
}
