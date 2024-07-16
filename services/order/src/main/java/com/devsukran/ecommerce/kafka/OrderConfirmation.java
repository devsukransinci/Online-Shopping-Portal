package com.devsukran.ecommerce.kafka;

import com.devsukran.ecommerce.customer.CustomerResponse;
import com.devsukran.ecommerce.order.PaymentMethod;
import com.devsukran.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
