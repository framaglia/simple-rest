package service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;
import java.util.List;

@JsonIgnoreProperties
public class Content {

    private List<Quote> quotes;

    public Content() {

    }


    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @Override
    public String toString() {
        return "Content{" +
                "quotes=" + quotes +
                '}';
    }
}
