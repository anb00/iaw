package com.iesemilidarder.anicolau.resolution.web.service;

import com.iesemilidarder.anicolau.resolution.web.bean.Star;
import com.iesemilidarder.anicolau.resolution.web.bean.Youthink;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface YouthinkRepository extends CrudRepository<Star, Long> {



    List<Youthink> findByName(String name);

}