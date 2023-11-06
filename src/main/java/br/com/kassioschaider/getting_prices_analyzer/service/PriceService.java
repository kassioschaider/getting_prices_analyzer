package br.com.kassioschaider.getting_prices_analyzer.service;

import br.com.kassioschaider.getting_prices_analyzer.document.Price;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PriceService {

    Flux<Price> findAll();
    Mono<Price> findById(String id);
    Mono<Price> save(Price price);

}
