package csku.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCollectionTest {
    @Test
    public void testSizeZero() {
        ArrayCollection arrayC = new ArrayCollection();
        assertEquals( 0, arrayC.size());
    }
}
