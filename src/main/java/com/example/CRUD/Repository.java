package com.example.CRUD;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository <User,Long>{
}
