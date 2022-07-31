// jack
package co.grandcircus.apiproject;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {
    private RestTemplate request = new RestTemplate();
    private HttpHeaders headers = new HttpHeaders();

    public SearchResponse SearchQuery(String searchTerm) {
        String url = "https://deezerdevs-deezer.p.rapidapi.com/search?q={0}";
        headers.set("X-RapidAPI-Key", "dc132e6a50mshfe6a15e27d35c7ep168bb0jsn9125e9d1d89d");
        headers.set("X-RapidAPI-Host", "deezerdevs-deezer.p.rapidapi.com");
        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
        ResponseEntity<SearchResponse> response = request.exchange(url, HttpMethod.GET,
                requestEntity, SearchResponse.class, searchTerm);
        System.out.println(response.getBody().getTotal());
        // // System.out.println(response.getBody().getData());
        System.out.println(response.getBody().getNext());
        // System.out.println(response.getBody().getClass());
        return response.getBody();
        // return response;
    }
}


// @Service
// public class SearchService {
// private RestTemplate request = new RestTemplate();

// public SearchResponse SearchQuery(String searchTerm) {
// String url = "https://deezerdevs-deezer.p.rapidapi.com/search?q=" + searchTerm;
// System.out.println(url);
// SearchResponse response = request.getForObject(url, SearchResponse.class);
// System.out.println(response.getNext());
// return response;

// }

// }
