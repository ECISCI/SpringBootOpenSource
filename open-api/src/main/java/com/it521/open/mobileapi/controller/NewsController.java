package com.it521.open.mobileapi.controller;

import com.it521.open.common.annotation.Log;
import com.it521.open.common.core.domain.ResponseResult;
import com.it521.open.mobileapi.annotation.PassAuth;
import com.it521.open.mobileapi.entity.SortEntity;
import com.it521.open.mobileapi.entity.news.NewsBannerEntity;
import com.it521.open.mobileapi.entity.news.NewsListEntity;
import com.it521.open.mobileapi.util.Constant;
import com.it521.open.mobilesql.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/openNews")
public class NewsController {

    private static final String TITLE = "title";

    private static final String IMAGE_URL = "image_url";

    private static final String LINK_URL = "link_url";


    @Autowired
    NewsService service;


    @PostMapping("/banner")
    @PassAuth
    @Log(title = "新闻列表轮播图")
    @ResponseBody
    public ResponseResult queryNewsBanner(@RequestBody Map<String, Object> params) {

        List<Object> queryResult = service.queryNewsBanner(params);
        List<NewsBannerEntity> bannerEntities = new ArrayList<>();

        for (Object result : queryResult) {

            NewsBannerEntity entity = new NewsBannerEntity();
            Map<String, Object> map = (Map<String, Object>) result;

            String title = map.get(TITLE) == null ? Constant.NULL_STR : (String) map.get(TITLE);
            String image_url = map.get(IMAGE_URL) == null ? Constant.NULL_STR : (String) map.get(IMAGE_URL);
            String link_url = map.get(LINK_URL) == null ? Constant.NULL_STR : (String) map.get(LINK_URL);
            String top_flag = map.get("top_flag") == null ? "0" : (String) map.get("top_flag");
            String create_date = map.get("create_date") == null ? "0" : (String) map.get("create_date");

            entity.setTitle(title);
            entity.setImageUrl(image_url);
            entity.setLinkUrl(link_url);
            entity.setTop_flag(Integer.parseInt(top_flag));
            entity.setCreate_date(Long.parseLong(create_date));

            bannerEntities.add(entity);
        }
        SortEntity.sortListByTime(bannerEntities);
        SortEntity.sortListByTopFlag(bannerEntities);

        return ResponseResult.success(bannerEntities);
    }

    @PostMapping("/newsList")
    @PassAuth
    @Log(title = "新闻列表")
    @ResponseBody
    public ResponseResult queryNewsList(@RequestBody Map<String, Object> params) {

        List<Object> objects = service.queryNewsList(params);

        List<NewsListEntity> newsListEntities = new ArrayList<>();

        for (Object result : objects) {

            Map<String, Object> map = (Map<String, Object>) result;

            String link_url = map.get(LINK_URL) == null ? Constant.NULL_STR : (String) map.get(LINK_URL);
            String title = map.get(TITLE) == null ? Constant.NULL_STR : (String) map.get(TITLE);
            String images_url = map.get("images_url") == null ? Constant.NULL_STR : (String) map.get("images_url");
            String top_flag = map.get("top_flag") == null ? "0" : (String) map.get("top_flag");

            String create_date = map.get("create_date") == null ? "0" : (String) map.get("create_date");

            List<String> imageList = new ArrayList<>();

            if (!images_url.equals(Constant.NULL_STR)) {

                String[] strs = images_url.split(",");

                for (int i = 0; i < strs.length; i++) {
                    imageList.add(strs[i]);
                }
            }
            NewsListEntity entity = new NewsListEntity();

            entity.setImagesUrl(imageList);
            entity.setTitle(title);
            entity.setLinkUrl(link_url);
            entity.setTop_flag(Integer.parseInt(top_flag));
            entity.setCreate_date(Long.parseLong(create_date));

            newsListEntities.add(entity);
        }
        SortEntity.sortListByTime(newsListEntities);
        SortEntity.sortListByTopFlag(newsListEntities);

        return ResponseResult.success(newsListEntities);
    }


}
