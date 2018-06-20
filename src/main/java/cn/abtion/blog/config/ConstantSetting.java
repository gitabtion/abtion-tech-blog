package cn.abtion.blog.config;

/**
 * @author abtion
 * @since 2018/4/26 16:17
 * email abtion@outlook.com
 */
public class ConstantSetting {
    public static final String BASE_PACKAGE = "cn.abtion.blog";
    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".domain";
    public static final String SERVICE_PACKAGE = BASE_PACKAGE+".service";
    public static final String MAPPER_PACKAGE = BASE_PACKAGE+".mappers";


    // ERROR CODE
    public static final int UNKNOWN = 5000;
    public static final int RESOURCE_NOT_EXIST = 10001;
    public static final int RESOURCE_EXISTED = 10002;
    public static final int PASSWORD_ERROR = 10003;
    public static final int FORM_VALIDATOR = 10005;
    public static final int PERMISSION_DENIED = 10009;

    public static final int NEED_LOGIN = 20001;


}
