package com.taiji.library.http.entity;

/**
 * 作者：panho on 2017-2-27 16:23
 * 邮箱: panhongzhi02@163.com
 * 功能描述：
 */

public class Request<T>{

    private Header mHeader;

    private Body<T> mBody;

    class Header{

        private String sourceSystem;//消息来源

        private String messageId;//消息ID

        public String getSourceSystem() {
            return sourceSystem;
        }

        public void setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
        }

        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }

        @Override
        public String toString() {
            return "Header{" +
                    "sourceSystem='" + sourceSystem + '\'' +
                    ", messageId='" + messageId + '\'' +
                    '}';
        }
    }

    class Body<T>{

        private T entity;

        public T getEntity() {
            return entity;
        }

        public void setEntity(T entity) {
            this.entity = entity;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "entity=" + entity +
                    '}';
        }
    }

    public Header getHeader() {
        return mHeader;
    }

    public void setHeader(Header header) {
        mHeader = header;
    }

    public Body<T> getBody() {
        return mBody;
    }

    public void setBody(Body<T> body) {
        mBody = body;
    }

    @Override
    public String toString() {
        return "Request{" +
                "mHeader=" + mHeader +
                ", mBody=" + mBody +
                '}';
    }
}
