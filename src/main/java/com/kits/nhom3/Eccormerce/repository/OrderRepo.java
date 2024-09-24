package com.kits.nhom3.Eccormerce.repository;

import com.kits.nhom3.Eccormerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
