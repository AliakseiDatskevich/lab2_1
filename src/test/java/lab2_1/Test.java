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
        int key = 3;
        int seq[] = {1, 2, 3, 4, 5};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(3, searchRes.getPosition());
    }
    
    @org.junit.Test
    public void midleKeyLeftPosition() {
        System.out.println("Midle left key position test:");
        int key = 2;
        int seq[] = {1, 2, 3, 4, 5};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(2, searchRes.getPosition());
    }
    
    @org.junit.Test
    public void midleKeyRightPosition() {
        System.out.println("Midle right key position test:");
        int key = 4;
        int seq[] = {1, 2, 3, 4, 5};
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

    @org.junit.Test
    public void chaoticSequence() {
        System.out.println("Choatic key position test:");
        int key = 45;
        int seq[] = {36, 1, 45, 46, 0, 312, 34};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(3, searchRes.getPosition());
    }

    @org.junit.Test
    public void decreasingSequence() {
        System.out.println("Decreasing test:");
        int key = 4;
        int seq[] = {21, 19, 13, 9, 8, 6, 4, 1};
        new BinarySearch();
        SearchResult searchRes = BinarySearch.search(key, seq);
        System.out.println(searchRes.getPosition() + "\n");
        assertTrue(searchRes.isFound());
        assertEquals(7, searchRes.getPosition());
    }

}
