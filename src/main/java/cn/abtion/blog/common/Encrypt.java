package cn.abtion.blog.common;

import cn.abtion.blog.exception.BaseException;
import cn.abtion.blog.exception.UnknownException;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * @author abtion
 * @since 2018/4/26 16:38
 * email abtion@outlook.com
 */
public class Encrypt {
    private static String salt = "aafje989031878af";
    public static String encrypt(String secret) throws BaseException {
        try {
            secret = secret + salt;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(secret.getBytes());
            return new BigInteger(1,md.digest()).toString();
        }catch (Exception e) {
            throw new UnknownException("Fail to get MD5");
        }
    }

    public static boolean check(String raw,String old) throws BaseException {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            raw = raw + salt;
            md.update(raw.getBytes());
            return new BigInteger(1,md.digest()).toString().equals(old);
        }catch (Exception e) {
            throw new UnknownException("Fail to get MD5");
        }
    }
}
