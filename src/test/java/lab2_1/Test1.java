package lab2_1;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Test1 {

    @Test
    public void test() {
        int seq[] = {1, 3, 4, 5, 6, 8, 13, 7};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(13, seq);
        System.out.println(searchRes.getPosition());
    }

}
