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

    @Test
    void intersect() {

        Rectangle rect1 = new Rectangle( 0,0, 5,5 );
        Rectangle rect2 = new Rectangle( 1,1, 6,6 );
        Rectangle rect3 = new Rectangle( -3,1, 2,6 );
        assertTrue(  rect1.intersect( rect2 ) );
    }
}