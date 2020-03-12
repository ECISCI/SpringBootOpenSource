package com.it521.open.mobilesql.mapper;

import java.util.List;
import java.util.Map;

public interface NewsMapper {

    List<Object> queryNewsBanner(Map<String, Object> params);

    List<Object> queryNewsList(Map<String,Object> params);
}
