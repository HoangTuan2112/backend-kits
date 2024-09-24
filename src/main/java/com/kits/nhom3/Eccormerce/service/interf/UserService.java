package com.kits.nhom3.Eccormerce.service.interf;

import com.kits.nhom3.Eccormerce.dto.LoginRequest;
import com.kits.nhom3.Eccormerce.dto.Response;
import com.kits.nhom3.Eccormerce.dto.UserDto;
import com.kits.nhom3.Eccormerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
