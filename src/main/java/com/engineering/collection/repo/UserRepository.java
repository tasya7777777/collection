package com.engineering.collection.repo;


import org.springframework.data.repository.CrudRepository;

import com.engineering.collection.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
