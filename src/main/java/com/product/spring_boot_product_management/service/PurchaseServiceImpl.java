package com.product.spring_boot_product_management.service;

import com.product.spring_boot_product_management.model.Purchase;
import com.product.spring_boot_product_management.repository.PurchaseRepository;
import com.product.spring_boot_product_management.repository.projection.PurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService{
    private PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase){
        purchase.setPurchaseTime(LocalDateTime.now());
        return  purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItemOfUser(Long userId){
        return purchaseRepository.findAllPurchaseOfUuser(userId);
    }
}
