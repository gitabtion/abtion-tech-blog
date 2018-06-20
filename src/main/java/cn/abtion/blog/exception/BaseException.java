package cn.abtion.blog.exception;

/**
 * @author abtion
 * @since 2018/4/26 16:32
 * email abtion@outlook.com
 */
public class BaseException extends Exception {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
