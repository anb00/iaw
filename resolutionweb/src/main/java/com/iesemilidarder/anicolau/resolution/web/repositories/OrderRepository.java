package com.iesemilidarder.anicolau.resolution.web.repositories;

import com.iesemilidarder.anicolau.resolution.web.domain.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByDescription(String description);

}
