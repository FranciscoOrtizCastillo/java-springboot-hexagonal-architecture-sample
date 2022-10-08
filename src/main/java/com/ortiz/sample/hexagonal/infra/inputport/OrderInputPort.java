package com.ortiz.sample.hexagonal.infra.inputport;

import java.math.BigDecimal;

import com.ortiz.sample.hexagonal.domain.Orders;

public interface OrderInputPort {
    public Orders createOrder( String customerId, BigDecimal total );
}
