package com.kits.nhom3.Eccormerce.service.interf;

import com.kits.nhom3.Eccormerce.dto.OrderRequest;
import com.kits.nhom3.Eccormerce.dto.Response;
import com.kits.nhom3.Eccormerce.enums.OrderStatus;
import org.springframework.data.domain.Pageable;

import java.time.LocalDateTime;

public interface OrderItemService {
    Response placeOrder(OrderRequest orderRequest);
    Response updateOrderItemStatus(Long orderItemId, String status);
    Response filterOrderItems(OrderStatus status, LocalDateTime startDate, LocalDateTime endDate, Long itemId, Pageable pageable);
}
