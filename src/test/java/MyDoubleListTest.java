import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyDoubleListTest {

    private MyDoubleList smallDLL;
    private MyDoubleList bigDLL;

    @BeforeEach
    public void setup() {
        smallDLL = new MyDoubleList();
        bigDLL = new MyDoubleList();
    }

    @Test
    public void testEmptySizeGetAddFirstClear() {
        assertTrue(smallDLL.isEmpty(), "Double list should be empty after being constructed.");
        assertEquals(0, smallDLL.size(), "Double list should contain zero elements after being constructed.");

        smallDLL.addFirst("ninety-nine");
        assertFalse(smallDLL.isEmpty(), "Double list should not be empty.");
        assertEquals("ninety-nine", smallDLL.get(0), "The element at index 0 should be ninety-nine.");
        assertEquals(1, smallDLL.size(), "The double list should contain one element after addFirst.");

        smallDLL.addFirst("seventy-seven");
        assertEquals("seventy-seven", smallDLL.get(0), "The element at index 0 should be seventy-seven.");
        assertEquals("ninety-nine", smallDLL.get(1), "The element at index 1 should be ninety-nine.");
        assertEquals(2, smallDLL.size(), "The double list should contain two elements after addFirst.");

        smallDLL.addFirst("fifty-five");
        assertEquals("fifty-five", smallDLL.get(0), "The element at index 0 should be fifty-five.");
        assertEquals("seventy-seven", smallDLL.get(1), "The element at index 1 should be seventy-seven.");
        assertEquals("ninety-nine", smallDLL.get(2), "The element at index 2 should be ninety-nine.");
        assertEquals(3, smallDLL.size(), "The double list should contain three elements after addFirst.");

        smallDLL.clear();
        assertTrue(smallDLL.isEmpty(), "Double list should be empty after clear.");
        assertEquals(0, smallDLL.size(), "Double list should contain zero elements after clear.");
    }

    @Test
    public void testAddLast() {
        smallDLL.addLast("one hundred");
        assertFalse(smallDLL.isEmpty(), "Double list should not be empty.");
        assertEquals("one hundred", smallDLL.get(0), "The element at index 0 should be one hundred.");
        assertEquals(1, smallDLL.size(), "The double list should contain one element after addLast.");

        smallDLL.addLast("one hundred and one");
        assertEquals("one hundred", smallDLL.get(0), "The element at index 0 should be one hundred.");
        assertEquals("one hundred and one", smallDLL.get(1), "The element at index 1 should be one hundred and one.");
        assertEquals(2, smallDLL.size(), "The double list should contain two elements after addLast.");

        smallDLL.addLast("one hundred and two");
        assertEquals("one hundred", smallDLL.get(0), "The element at index 0 should be one hundred.");
        assertEquals("one hundred and one", smallDLL.get(1), "The element at index 1 should be one hundred and one.");
        assertEquals("one hundred and two", smallDLL.get(2), "The element at index 2 should be one hundred and two.");
        assertEquals(3, smallDLL.size(), "The double list should contain three elements after addLast.");
    }

    @Test
    public void testAddSet() {
        smallDLL.add(0, "eighteen");
        smallDLL.add(0, "forty-five");
        smallDLL.add(1, "sixty-seven");
        smallDLL.add(3, "seventy-three");
        smallDLL.add(2, "eighty-eight");
        // "forty-five", "sixty-seven", "eighty-eight", "eighteen", "seventy-three"

        assertEquals(5, smallDLL.size());
        assertEquals("forty-five", smallDLL.get(0));
        assertEquals("sixty-seven", smallDLL.get(1));
        assertEquals("eighty-eight", smallDLL.get(2));
        assertEquals("eighteen", smallDLL.get(3));
        assertEquals("seventy-three", smallDLL.get(4));

        smallDLL.set(0, "twelve");
        smallDLL.set(1, "twenty-two");
        smallDLL.set(4, "eighty-two");
        smallDLL.set(1, "thirty-seven");
        smallDLL.set(4, "seventy-one");
        // "twelve", "thirty-seven", "eighty-eight", "eighteen", "seventy-one"

        assertEquals(5, smallDLL.size());
        assertEquals("twelve", smallDLL.get(0));
        assertEquals("thirty-seven", smallDLL.get(1));
        assertEquals("eighty-eight", smallDLL.get(2));
        assertEquals("eighteen", smallDLL.get(3));
        assertEquals("seventy-one", smallDLL.get(4));
    }

    @Test
    public void testRemove() {
        smallDLL.addFirst("nine");
        smallDLL.addFirst("seventy-seven");
        smallDLL.addFirst("twenty-four");
        smallDLL.addFirst("thirty-six");
        smallDLL.addFirst("sixty-three");
        smallDLL.addFirst("eighty-nine");
        smallDLL.addFirst("fourteen");
        // "fourteen", "eighty-nine", "sixty-three", "thirty-six",
        //   "twenty-four", "seventy-seven", "nine"

        assertEquals(7, smallDLL.size());
        assertEquals("fourteen", smallDLL.get(0));
        assertEquals("eighty-nine", smallDLL.get(1));
        assertEquals("sixty-three", smallDLL.get(2));
        assertEquals("thirty-six", smallDLL.get(3));
        assertEquals("twenty-four", smallDLL.get(4));
        assertEquals("seventy-seven", smallDLL.get(5));
        assertEquals("nine", smallDLL.get(6));

        assertEquals("fourteen", smallDLL.remove(0));
        // "eighty-nine", "sixty-three", "thirty-six", "twenty-four", "seventy-seven", "nine"
        assertEquals(6, smallDLL.size());
        assertEquals("eighty-nine", smallDLL.get(0));
        assertEquals("sixty-three", smallDLL.get(1));
        assertEquals("thirty-six", smallDLL.get(2));
        assertEquals("twenty-four", smallDLL.get(3));
        assertEquals("seventy-seven", smallDLL.get(4));
        assertEquals("nine", smallDLL.get(5));

        assertEquals("nine", smallDLL.remove(5));
        // "eighty-nine", "sixty-three", "thirty-six", "twenty-four", "seventy-seven"
        assertEquals(5, smallDLL.size());
        assertEquals("eighty-nine", smallDLL.get(0));
        assertEquals("sixty-three", smallDLL.get(1));
        assertEquals("thirty-six", smallDLL.get(2));
        assertEquals("twenty-four", smallDLL.get(3));
        assertEquals("seventy-seven", smallDLL.get(4));

        assertEquals("thirty-six", smallDLL.remove(2));
        // "eighty-nine", "sixty-three", "twenty-four", "seventy-seven"
        assertEquals(4, smallDLL.size());
        assertEquals("eighty-nine", smallDLL.get(0));
        assertEquals("sixty-three", smallDLL.get(1));
        assertEquals("twenty-four", smallDLL.get(2));
        assertEquals("seventy-seven", smallDLL.get(3));

        assertEquals("sixty-three", smallDLL.remove(1));
        // "eighty-nine", "twenty-four", "seventy-seven"
        assertEquals(3, smallDLL.size());
        assertEquals("eighty-nine", smallDLL.get(0));
        assertEquals("twenty-four", smallDLL.get(1));
        assertEquals("seventy-seven", smallDLL.get(2));

        assertEquals("seventy-seven", smallDLL.remove(2));
        // "eighty-nine", "twenty-four"
        assertEquals(2, smallDLL.size());
        assertEquals("eighty-nine", smallDLL.get(0));
        assertEquals("twenty-four", smallDLL.get(1));

        assertEquals("eighty-nine", smallDLL.remove(0));
        // "twenty-four"
        assertEquals(1, smallDLL.size());
        assertEquals("twenty-four", smallDLL.get(0));

        assertEquals("twenty-four", smallDLL.remove(0));
        assertTrue(smallDLL.isEmpty());
        assertEquals(0, smallDLL.size());
    }

    @Test
    public void testLargeSimple() {
        int max = 10000;
        for(int i = 0; i < max; i++){
            assertEquals(i, bigDLL.size());
            bigDLL.addLast("***" + i);
        }
        for(int i = max; i > 0; i--){
            assertEquals(i, bigDLL.size());
            assertEquals("***" + (i - 1), bigDLL.remove(i - 1));
        }
        for(int i = 0; i < max; i++){
            assertEquals(i, bigDLL.size());
            bigDLL.addFirst("@@@" + i);
        }
        bigDLL.clear();
        assertTrue(bigDLL.isEmpty());
        assertEquals(0, bigDLL.size());
    }

    @Test
    public void testFinders() {
        smallDLL.addLast("twenty-one");
        smallDLL.addLast("negative sixty four");
        smallDLL.addLast("ninety-four");
        smallDLL.addLast("negative seventy-two");
        smallDLL.addLast("eighty-four");
        smallDLL.addLast("negative twenty-eight");

        assertEquals(0, smallDLL.indexOf("twenty-one"), "IndexOf cannot find element twenty-one.");
        assertEquals(1, smallDLL.indexOf("negative sixty four"), "IndexOf cannot find element negative sixty four.");
        assertEquals(2, smallDLL.indexOf("ninety-four"), "IndexOf cannot find element ninety-four.");
        assertEquals(3, smallDLL.indexOf("negative seventy-two"), "IndexOf cannot find element negative seventy-two.");
        assertEquals(4, smallDLL.indexOf("eighty-four"), "IndexOf cannot find element eighty-four.");
        assertEquals(5, smallDLL.indexOf("negative twenty-eight"), "IndexOf cannot find element negative twenty-eight.");

        assertEquals(-1, smallDLL.indexOf("zero"), "IndexOf thinks it found element zero.");
        assertEquals(-1, smallDLL.indexOf("negative fifty-five"), "IndexOf thinks it found element negative fifty-five.");
        assertEquals(-1, smallDLL.indexOf("sixty"), "IndexOf thinks it found element sixty.");
        assertEquals(-1, smallDLL.indexOf("negative thirty-eight"), "IndexOf thinks it found element negative thirty-eight.");
        assertEquals(-1, smallDLL.indexOf("ninety-three"), "IndexOf thinks it found element ninety-three.");

        assertTrue(smallDLL.contains("twenty-one"), "Contains cannot find element twenty-one.");
        assertTrue(smallDLL.contains("negative sixty four"), "Contains cannot find element negative sixty four.");
        assertTrue(smallDLL.contains("ninety-four"), "Contains cannot find element ninety-four.");
        assertTrue(smallDLL.contains("negative seventy-two"), "Contains cannot find element negative seventy-two.");
        assertTrue(smallDLL.contains("eighty-four"), "Contains cannot find element eighty-four.");
        assertTrue(smallDLL.contains("negative twenty-eight"), "Contains cannot find element negative twenty-eight.");

        assertFalse(smallDLL.contains("zero"), "Contains thinks it found element zero.");
        assertFalse(smallDLL.contains("negative fifty-five"), "Contains thinks it found element negative fifty-five.");
        assertFalse(smallDLL.contains("sixty"), "Contains thinks it found element sixty.");
        assertFalse(smallDLL.contains("negative thirty-eight"), "Contains thinks it found element negative thirty-eight.");
        assertFalse(smallDLL.contains("ninety-three"), "Contains thinks it found element ninety-three.");
    }

    private void assertIteratorContains(Iterator<String> itr, String ... elements){
        List<String> found = new LinkedList<>();
        for(String e : elements){
            assertTrue(itr.hasNext(),
                    "Expected iterator to produce " + Arrays.toString(elements) + " but produced " + found);
            String test = itr.next();
            found.add(test);
            assertEquals(test, e,
                    "Expected iterator to produce " + Arrays.toString(elements) + " but start of iterator produced " + found);
        }

        if(itr.hasNext()){
            while(itr.hasNext())
                found.add(itr.next());
            fail("Expected iterator to produce " + Arrays.toString(elements) + " but produced " + found);
        }
    }

    @Test
    public void testGetPreOrderIterator() {
        smallDLL.addLast("One");
        smallDLL.addLast("Two");
        smallDLL.addLast("Three");
        smallDLL.addLast("Four");
        Iterator<String> lister = smallDLL.getIterator();
        assertIteratorContains(lister, "One", "Two", "Three", "Four");
    }

    @Test
    public void testIndexOutOfBoundsException(){
        assertThrows(IndexOutOfBoundsException.class,
                () -> smallDLL.add(-1, "one hundred and two"),
                "Trying to add at index -1 should throw OOB.");
        assertThrows(IndexOutOfBoundsException.class,
                () -> smallDLL.add(2, "one hundred and two"),
                "Trying to add at index 2 after being constructed should throw OOB.");
        smallDLL.addLast("one hundred");
        smallDLL.addLast("one hundred and one");
        smallDLL.addLast("one hundred and two");
        assertThrows(IndexOutOfBoundsException.class,
                () -> smallDLL.add(5, "one hundred and five"),
                "Trying to add at index 5 when size is three should throw OOB.");
    }

    @Test
    public void testNullPointerException(){
        smallDLL.addLast("three hundred");
        smallDLL.addLast("three hundred and one");
        smallDLL.addLast("three hundred and two");
        assertThrows(NullPointerException.class,
                () -> smallDLL.addFirst(null),
                "Argument to addFirst cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallDLL.addLast(null),
                "Argument to addLast cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallDLL.add(1, null),
                "Argument to add cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallDLL.set(1, null),
                "Argument to add cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallDLL.indexOf(null),
                "Argument to indexOf cannot be null.");
        assertThrows(NullPointerException.class,
                () -> smallDLL.contains(null),
                "Argument to contains cannot be null.");
    }
}
