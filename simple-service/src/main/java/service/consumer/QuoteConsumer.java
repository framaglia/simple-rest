package service.consumer;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;
import service.model.Quote;
import service.model.QuoteEnvelope;

public class QuoteConsumer {

    private final static String QUOTE_ENDPOINT = "http://quotes.rest/qod.json";
    private final Logger log = Logger.getLogger(QuoteConsumer.class);
    private final RestTemplate restTemplate;


    public QuoteConsumer() {
        this.restTemplate = new RestTemplate();
    }

    public Quote getRandomQuote() {
        QuoteEnvelope quoteEnvelope= restTemplate.getForObject(QUOTE_ENDPOINT, QuoteEnvelope.class);
        Quote quote = quoteEnvelope.getContent().getQuotes().get(0);
        log.info("GET: " + quote);

        return quote;
    }

}
