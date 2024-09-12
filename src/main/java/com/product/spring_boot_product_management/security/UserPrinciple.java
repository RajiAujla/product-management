package com.product.spring_boot_product_management.security;

import com.product.spring_boot_product_management.model.User;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPrinciple implements UserDetails {

    private Long id;
    private String username;
    transient private String password; //don't show on serialized places.
    transient private User user; //don't use it,only for login operation, don't use in JWT
    private Set<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
