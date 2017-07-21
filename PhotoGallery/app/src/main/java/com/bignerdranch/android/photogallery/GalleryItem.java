package com.bignerdranch.android.photogallery;

/**
 * Created by parkerzhu on 2016/12/18.
 */

public class GalleryItem {
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    private String mCaption;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    private String mId;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    private String mUrl;

    public String toString() {
        return mCaption;
    }
}
