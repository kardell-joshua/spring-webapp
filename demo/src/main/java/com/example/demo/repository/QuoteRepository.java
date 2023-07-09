package com.example.demo.repository;

import com.example.demo.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    @Query("SELECT q FROM Quote q WHERE q.quote LIKE %?1%")
    List<Quote> getContainingQuote(String word);
}