//jack
package co.grandcircus.apiproject;

import javax.naming.directory.SearchResult;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SearchService {
    private RestTemplate request = new RestTemplate();

    public SearchResult SearchRes(String searchTerm) {
        String url = "https://deezerdevs-deezer.p.rapidapi.com/search?q=" + searchTerm;
        System.out.println(url);
        SearchResponse response = request.getForObject(url, responseType: SearchResponse.class )
        return SearchResult;
        
    }
    
}
