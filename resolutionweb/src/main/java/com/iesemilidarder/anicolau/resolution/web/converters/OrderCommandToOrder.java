package com.iesemilidarder.anicolau.resolution.web.converters;


import com.iesemilidarder.anicolau.resolution.web.commands.OrderCommand;
import com.iesemilidarder.anicolau.resolution.web.domain.Order;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class OrderCommandToOrder 
  implements Converter<OrderCommand, Order> {

  @Synchronized
  @Nullable
  @Override
 public Order convert(OrderCommand orderCommand) {
    if (orderCommand == null) {
      return null;
    }

    final Order order = new Order();
    order.setId(orderCommand.getId());
    order.setDescription(orderCommand.getDescription());
    order.setDate(orderCommand.getDate());
    order.setTotal(orderCommand.getTotal());
    return order;
 }
}