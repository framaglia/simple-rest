package service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;

@JsonIgnoreProperties
public class Quote {

    private String quote;
    private String author;
    private URL background;


    public Quote() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public URL getBackground() {
        return background;
    }

    public void setBackground(URL background) {
        this.background = background;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quote='" + quote + '\'' +
                ", author='" + author + '\'' +
                ", background=" + background +
                '}';
    }
}
