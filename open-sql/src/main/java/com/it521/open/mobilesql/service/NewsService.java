package com.it521.open.mobilesql.service;

import java.util.List;
import java.util.Map;

public interface NewsService {

    List<Object> queryNewsBanner(Map<String, Object> params);


    List<Object> queryNewsList(Map<String, Object> params);
}
