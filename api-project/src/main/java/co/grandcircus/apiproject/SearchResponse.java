package co.grandcircus.apiproject;

import java.util.List;


public class SearchResponse {

    private List<SearchResult> data;
    private String total;
    private String next;

    public List<SearchResult> getData() {
        return data;
    }

    public void setData(List<SearchResult> data) {
        this.data = data;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public SearchResponse() {}

    public SearchResponse(List<SearchResult> data, String total, String next) {
        this.data = data;
        this.total = total;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SearchResponse [data=" + data + ", next=" + next + ", total=" + total + "]";
    }

}
