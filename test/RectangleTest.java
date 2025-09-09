import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void inside() {

        Rectangle rect = new Rectangle( 0,0, 5,5 );
        assertTrue(  rect.inside( 1,1 ) );
        assertTrue(  rect.inside( 0,5 ) );
        assertFalse( rect.inside( -1, -1 ) );
    }
}