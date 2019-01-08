package com.iesemilidarder.anicolau.resolution.web.service;



import com.iesemilidarder.anicolau.resolution.web.bean.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NewsRepository extends CrudRepository<News, Long> {
    List<News> findByTitle(String title);


}