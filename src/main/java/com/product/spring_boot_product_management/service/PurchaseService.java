package com.product.spring_boot_product_management.service;

import com.product.spring_boot_product_management.model.Purchase;
import com.product.spring_boot_product_management.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findPurchaseItemOfUser(Long userId);
}
