package com.monkdevs.UserServices.Repositories;

import com.monkdevs.UserServices.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
