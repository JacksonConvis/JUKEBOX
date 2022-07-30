// jack
package co.grandcircus.apiproject;

import javax.naming.directory.SearchResult;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {
    private RestTemplate request = new RestTemplate();

    public SearchResponse SearchRes(String searchTerm) {
        String url = "https://deezerdevs-deezer.p.rapidapi.com/search?q=" + searchTerm;
        System.out.println(url);
        SearchResponse response = request.getForObject(url, SearchResponse.class);
        return response;

    }

}
