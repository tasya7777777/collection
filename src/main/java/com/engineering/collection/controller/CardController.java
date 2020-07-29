package com.engineering.collection.controller;

import com.engineering.collection.model.Card;
import com.engineering.collection.model.User;
import com.engineering.collection.repo.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CardController {

	@Autowired
	CardRepository repository;

	@GetMapping("/card/{id}")
	public Card getCard(@PathVariable("id") long id) {
		System.out.println("Get Cardwith ID = " + id + "...");
		Optional<Card> card = repository.findById(id);

		return card.get();
	}

	@GetMapping("/cards")
	public List<Card> getAllCards() {
		System.out.println("Get all Cards...");

		List<Card> cards = new ArrayList<>();
		repository.findAll().forEach(cards::add);

		return cards;
	}


}
