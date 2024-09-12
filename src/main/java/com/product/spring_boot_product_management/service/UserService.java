package com.product.spring_boot_product_management.service;

import com.product.spring_boot_product_management.model.Role;
import com.product.spring_boot_product_management.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
