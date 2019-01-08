package com.iesemilidarder.anicolau.resolution.web.service;

import com.iesemilidarder.anicolau.resolution.web.bean.Star;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StarRepository extends CrudRepository<Star, Long> {

    List<Star> findByName(String name);

}