package com.iesemilidarder.anicolau.resolution.web.service;

import com.iesemilidarder.anicolau.resolution.web.bean.Technology;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface TechnologyRepository extends CrudRepository<Technology, Long> {

    List<Technology> findByName(String name);
    List<Technology> findByCreationYear(Integer creationyear);
    @Query("select t from Technology t where t.name like :name")
    Stream<Technology> findByNameReturnStream(@Param("name") String name);
}
