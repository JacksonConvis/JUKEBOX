package co.grandcircus.apiproject;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface FavoriteRepository extends MongoRepository<SearchResult, String> {
    List<SearchResult> findAll();
    List<SearchResult> findByArtist(String name);
    List<SearchResult> findByTitleContainingIgnoreCase(String title);
    List<SearchResult> findByAlbum (String title);
    
   
}
