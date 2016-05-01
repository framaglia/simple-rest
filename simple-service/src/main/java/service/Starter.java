package service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.consumer.QuoteConsumer;

@SpringBootApplication
public class Starter implements CommandLineRunner{

    private QuoteConsumer quoteConsumer;

    public static void main(String args[]) {
        SpringApplication.run(Starter.class);
    }

    public void run(String... strings) throws Exception {
        this.quoteConsumer = new QuoteConsumer();
        this.quoteConsumer.getRandomQuote();
    }
}
