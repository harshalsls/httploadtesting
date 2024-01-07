package http;


import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class HTTPUtility {

public void testURL(String methodType, String url) {
try {
    HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("http://eu.httpbin.org"))
            .GET()
            .build();

    HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
    System.out.println("Response Code : " + response.statusCode());
} catch (URISyntaxException | IOException | InterruptedException e) {
    throw new RuntimeException(e);
}
}

}
