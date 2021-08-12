package com.avanade.dio.jwt.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailServiceImplet {
    UserDetails LoadUserByUserName(String userName) throws UsernameNotFoundException;
}
