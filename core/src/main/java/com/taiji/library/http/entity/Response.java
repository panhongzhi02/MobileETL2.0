package com.taiji.library.http.entity;

/**
 * 作者：panho on 2017-2-27 16:30
 * 邮箱: panhongzhi02@163.com
 * 功能描述：
 */

public class Response<T>{

    public static final String SUCCESS = "0";

    public static final String FAILED = "1";

    private Header mHeader;

    private Body<T> mBody;

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
        return "Response{" +
                "mHeader=" + mHeader +
                ", mBody=" + mBody +
                '}';
    }

    public class Header{
        private String sourceSystem;
        private String messageId;

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

    public class Body<T>{
        private String resultCode;
        private String resultContent;

        private T entity;

        public String getResultCode() {
            return resultCode;
        }

        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        public String getResultContent() {
            return resultContent;
        }

        public void setResultContent(String resultContent) {
            this.resultContent = resultContent;
        }

        public T getEntity() {
            return entity;
        }

        public void setEntity(T entity) {
            this.entity = entity;
        }

        @Override
        public String toString() {
            return "Body{" +
                    "resultCode='" + resultCode + '\'' +
                    ", resultContent='" + resultContent + '\'' +
                    '}';
        }
    }


}
