package com.iesemilidarder.anicolau.resolution.web.service;

import java.util.List;
import java.util.Optional;

import com.iesemilidarder.anicolau.resolution.web.commands.OrderCommand;
import com.iesemilidarder.anicolau.resolution.web.domain.Order;

public interface OrderService {
	public Optional<Order> getById(Long id);
	public List<Order> getOrders();
	public OrderCommand saveOrder(OrderCommand orderCommand);
}
