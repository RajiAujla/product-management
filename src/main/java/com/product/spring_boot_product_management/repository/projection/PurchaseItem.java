package com.product.spring_boot_product_management.repository.projection;

import java.time.LocalDateTime;

public interface PurchaseItem {
    String getName();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
