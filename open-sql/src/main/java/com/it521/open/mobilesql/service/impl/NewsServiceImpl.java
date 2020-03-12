package com.it521.open.mobilesql.service.impl;

import com.it521.open.mobilesql.mapper.NewsMapper;
import com.it521.open.mobilesql.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsMapper mapper;


    @Override
    public List<Object> queryNewsBanner(Map<String, Object> params) {


        return mapper.queryNewsBanner(params);
    }

    @Override
    public List<Object> queryNewsList(Map<String, Object> params) {
        return mapper.queryNewsList(params);
    }
}
