package junittest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iieseanu on 3/20/2017.
 */
public class StringHelperTest {

    // CDEF => CDEF , CDAA => CDAA
    StringHelper helper = new StringHelper();

    @Test
    public void truncateAInFirst2Positions_TheFirst2Positions() throws Exception {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));

    }

    @Test
    public void truncateAInFirst2Positions_TheFirst1Position() throws Exception {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void truncateAInFirst2Positions_AreNotInFirst2Positions() throws Exception {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void truncateAInFirst2Positions_AreNotIn1Position() throws Exception {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

   /*

    @Test
    public void areFirstAndLastTwoCharactersTheSame() throws Exception {
        assertEquals("CD", helper.areFirstAndLastTwoCharactersTheSame("ACD"));

    }
**/
}