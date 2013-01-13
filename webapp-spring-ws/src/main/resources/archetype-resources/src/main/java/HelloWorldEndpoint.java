package ${package};

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;

import ${package}.schemas.GetWorldBestPrettyGirlResponse;
import ${package}.schemas.GetWorldBestPrettyGirlRequest;
import ${package}.schemas.PrettyGirl;

/**
 * @author $Author$
 * @version $Rev$
 */
@Endpoint
public class HelloWorldEndpoint {

    @PayloadRoot(namespace = "http://sunggun.me/samples/helloWorld/", localPart = "getWorldBestPrettyGirlRequest")
    public GetWorldBestPrettyGirlResponse getWorldBestPrettyGirl(GetWorldBestPrettyGirlRequest request) {
        GetWorldBestPrettyGirlResponse response = new GetWorldBestPrettyGirlResponse();
        PrettyGirl yina = new PrettyGirl();
        yina.setFirstName("Yina");
        yina.setLastName("Yu");
        yina.setComment("Hello World!!! .... your input was ... " + request.getName());
        response.setPrettyGirl(yina);
        return response;
    }
}