package com.it521.open.mobileapi.entity.news;

import com.it521.open.mobileapi.entity.SortEntity;

public class NewsBannerEntity extends SortEntity {

    private String imageUrl;
    private String linkUrl;
    private String title;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "NewsBannerEntity{" +
                "imageUrl='" + imageUrl + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
