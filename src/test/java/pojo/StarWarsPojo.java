package pojo;

import java.util.List;
import java.util.Map;

public class StarWarsPojo {

    private int count;
    private String next;
    private String previous;
    private List<Map<String, Object>> maps;
    private List<ResultPojo> results;

    public List<ResultPojo> getResults() {
        return results;
    }

    public void setResults(List<ResultPojo> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Map<String, Object>> getMaps() {
        return maps;
    }

    public void setMaps(List<Map<String, Object>> maps) {
        this.maps = maps;
    }
}
