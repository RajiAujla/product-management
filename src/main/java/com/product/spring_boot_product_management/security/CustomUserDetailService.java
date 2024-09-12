package com.product.spring_boot_product_management.security;

import com.product.spring_boot_product_management.model.User;
import com.product.spring_boot_product_management.service.UserService;
import com.product.spring_boot_product_management.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
    Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));
    return UserPrinciple.builder()
            .user(user)
            .id(user.getId())
            .username(user.getUsername())
            .password(user.getPassword())
            .authorities(authorities)
            .build();
    }
}
