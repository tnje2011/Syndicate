package com.syndicate.utils;

/**
 * Created by tom on 2016/6/19.
 */
public class Constants {
    public enum UserStatus {
        ACTIVE("激活", 0),//
        DELETED("已删除", 1),//
        FORBIDDEN("封停", 2),//
        ABNORMAL("异常", 3),//
        ;
        private String name;
        private int code;

        UserStatus(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static String getNameByCode(int code) {
            for (UserStatus userStatus : UserStatus.values()) {
                if (userStatus.code == code) {
                    return userStatus.name;
                }
            }
            return ABNORMAL.name;
        }
    }

    public enum BlogStatus {
        PUBLISH("发表", 0),//
        DELETED("已删除", 1),//
        FORBIDDEN("封停", 2),//
        HIDE("隐藏", 3),//
        ABNORMAL("异常", 4),//
        ;
        private String name;
        private int code;

        BlogStatus(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static String getNameByCode(int code) {
            for (UserStatus userStatus : UserStatus.values()) {
                if (userStatus.code == code) {
                    return userStatus.name;
                }
            }
            return ABNORMAL.name;
        }
    }
}
