package co.grandcircus.apiproject;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {

    SearchResponse response  = request.getFo;

    @JsonProperty("data")
    private List<SearchResult> searchResults;
    @JsonProperty("results")
    private String searchTotal;
    private String next;

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    public String getSearchTotal() {
        return searchTotal;
    }

    public void setSearchTotal(String searchTotal) {
        this.searchTotal = searchTotal;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

}
