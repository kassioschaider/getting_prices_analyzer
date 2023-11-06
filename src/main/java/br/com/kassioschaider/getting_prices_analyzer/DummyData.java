package br.com.kassioschaider.getting_prices_analyzer;

import br.com.kassioschaider.getting_prices_analyzer.document.Price;
import br.com.kassioschaider.getting_prices_analyzer.repository.PriceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class DummyData implements CommandLineRunner {

    private final PriceRepository repository;

    public DummyData(PriceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll()
                .thenMany(Flux.just("farma1", "farma2")
                        .map(tag -> new Price(UUID.randomUUID().toString(), tag, BigDecimal.ZERO))
                        .flatMap(repository::save))
                .subscribe(System.out::println);
    }
}
