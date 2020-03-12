package com.it521.open.mobileapi.entity.news;

import com.it521.open.mobileapi.entity.SortEntity;

import java.util.List;

public class NewsListEntity extends SortEntity {

    private String title;
    private String linkUrl;
    private List<String> imagesUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public List<String> getImagesUrl() {
        return imagesUrl;
    }

    public void setImagesUrl(List<String> imagesUrl) {
        this.imagesUrl = imagesUrl;
    }

    @Override
    public String toString() {
        return "NewsListEntity{" +
                "title='" + title + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", imagesUrl=" + imagesUrl +
                '}';
    }
}
