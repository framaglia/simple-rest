package service.producer;

import javax.jws.WebService;

@WebService
public interface SaySomethingService {

    /**
     * The Service signature
     *
     * @return something to say
     */
    String saySomething();
}
