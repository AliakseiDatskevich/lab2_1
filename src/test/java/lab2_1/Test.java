package lab2_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Test {

    @org.junit.Test
    public void search() {
        System.out.println("Search test:");
        int key = 8;
        int seq[] = {1, 3, 4, 5, 6, 8, 13, 21};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(6, searchRes.getPosition());
    }

    @org.junit.Test
    public void noKeyInSeq() {
        System.out.println("No key in sequence test:");
        int key = 8;
        int seq[] = {1, 2, 6};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertFalse(searchRes.isFound());
        assertEquals(-1, searchRes.getPosition());
    }

    @org.junit.Test
    public void firstKeyPosition() {
        System.out.println("First key position test:");
        int key = 8;
        int seq[] = {8, 9, 14, 65, 99};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(1, searchRes.getPosition());
    }

    @org.junit.Test
    public void lastKeyPosition() {
        System.out.println("Last key position test:");
        int key = 9;
        int seq[] = {2, 3, 4, 5, 6, 7, 8, 9};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(8, searchRes.getPosition());
    }

    @org.junit.Test
    public void midleKeyPosition() {
        System.out.println("Midle key position test:");
        int key = 5;
        int seq[] = {2, 3, 4, 5, 6, 7, 8};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(4, searchRes.getPosition());
    }

    @org.junit.Test
    public void emptySeq() {
        System.out.println("Empty sequence test:");
        int key = 7;
        int seq[] = {};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertFalse(searchRes.isFound());
        assertEquals(-1, searchRes.getPosition());
    }
}
