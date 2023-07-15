package com.monkdevs.UserServices.Services;

import com.monkdevs.UserServices.Entities.User;

import java.util.List;

public interface IUserService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String userId);
}
