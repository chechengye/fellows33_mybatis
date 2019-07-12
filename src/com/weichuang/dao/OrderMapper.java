package com.weichuang.dao;

import com.weichuang.pojo.Order;
import com.weichuang.pojo.OrderUser;

import java.util.List;

public interface OrderMapper {

    List<Order> getAllOrders();

    List<OrderUser> getOrderAndUser();

    List<Order> getOrdersByOBO();
}
