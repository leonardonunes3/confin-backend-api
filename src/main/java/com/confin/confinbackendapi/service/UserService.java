package com.confin.confinbackendapi.service;

import com.confin.confinbackendapi.dto.UserDto;
import com.confin.confinbackendapi.model.User;

public interface UserService {
    User create(UserDto userDto);
    User findByEmail(String email);
    User update(UserDto userDto);
    void delete(Long id);
}
