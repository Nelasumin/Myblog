package com.hgx.service;

import com.hgx.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
