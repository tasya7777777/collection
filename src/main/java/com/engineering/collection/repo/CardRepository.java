package com.engineering.collection.repo;

import com.engineering.collection.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
