package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.User;
@Repository
public interface userrepo extends JpaRepository<User, String>
{

}
