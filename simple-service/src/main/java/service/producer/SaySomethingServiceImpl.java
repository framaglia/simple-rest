package service.producer;

import javax.jws.WebService;

@WebService(endpointInterface = "com.crap.service.producer.SaySomethingService",
            serviceName = "SaySomthing")
public class SaySomethingServiceImpl implements SaySomethingService {

    public String saySomething() {
        return null;
    }
}
