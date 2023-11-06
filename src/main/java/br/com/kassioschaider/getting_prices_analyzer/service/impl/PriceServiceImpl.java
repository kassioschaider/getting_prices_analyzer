package br.com.kassioschaider.getting_prices_analyzer.service.impl;

import br.com.kassioschaider.getting_prices_analyzer.document.Price;
import br.com.kassioschaider.getting_prices_analyzer.repository.PriceRepository;
import br.com.kassioschaider.getting_prices_analyzer.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository repository;

    @Override
    public Flux<Price> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Price> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<Price> save(Price price) {
        return repository.save(price);
    }
}
