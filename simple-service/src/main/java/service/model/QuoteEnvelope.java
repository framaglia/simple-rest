package service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteEnvelope {

    private Content contents;

    public QuoteEnvelope() {

    }

    public Content getContent() {
        return contents;
    }

    public void setContents(Content contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "QuoteEnvelope{" +
                "contents=" + contents +
                '}';
    }
}
