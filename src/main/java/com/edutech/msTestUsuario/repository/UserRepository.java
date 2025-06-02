package com.edutech.msTestUsuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutech.msTestUsuario.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User save(User user);

    List<User> findAll();

    User findById(int idUser);
}
