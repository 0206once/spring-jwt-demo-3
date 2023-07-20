package com.springjwt.repositories;

import com.springjwt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
public interface UserRepo extends JpaRepository<User,Long> {

}
