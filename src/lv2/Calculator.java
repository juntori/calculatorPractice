package lv2;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    private final List<Double> results;

    public Calculator(){
        this.results = new ArrayList<>();
    }

    public void saveResult(double result){
        results.add(result);
    }

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> newResults){
        results.clear();
        results.addAll(newResults);
    }

    public void removeResult() {
        results.remove(0);
    }

    public void inquiryResults(){
        for (Double result : results) {
            System.out.println(result);
        }
    }
}
