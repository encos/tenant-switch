package org.encos.mlt.service.impl;

import org.encos.mlt.dto.OrderDto;
import org.encos.mlt.service.IOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Enrico Costanzi
 */
@Service
public class OrderService implements IOrderService{

    Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Override
    public List<OrderDto> getOrders() {
        logger.info("Hello I'm the default order service");
        return null;
    }
}