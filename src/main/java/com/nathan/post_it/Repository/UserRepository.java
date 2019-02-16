package com.nathan.post_it.Repository;

import com.nathan.post_it.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsernameAndPassword(String username, String password);
    User findUserByUsername(String username);
}
