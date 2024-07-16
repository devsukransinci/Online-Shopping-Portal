package com.devsukran.ecommerce.payment;

import com.devsukran.ecommerce.customer.CustomerResponse;
import com.devsukran.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}
