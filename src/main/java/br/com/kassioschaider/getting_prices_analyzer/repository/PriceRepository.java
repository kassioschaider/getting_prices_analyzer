package br.com.kassioschaider.getting_prices_analyzer.repository;

import br.com.kassioschaider.getting_prices_analyzer.document.Price;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PriceRepository extends ReactiveMongoRepository<Price, String> {
}
