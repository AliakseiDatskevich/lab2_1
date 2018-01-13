package lab2_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class Test1 {

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
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

    @Test
    public void decreasingSequence() {
        System.out.println("Decreasing test:");
        int key = 3;
        int seq[] = {8, 7, 6, 5, 4, 3, 2};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(6, searchRes.getPosition());
    }

    @Test
    public void chaoticSequence() {
        System.out.println("Midle key position test:");
        int key = 45;
        int seq[] = {23, 1, 45, 46, 0, 312, 34};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(3, searchRes.getPosition());
    }
}
