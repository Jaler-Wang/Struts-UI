import ognl.Ognl;
import ognl.OgnlContext;
import org.junit.Test;

/**
 * Created by U0148394 on 10/15/2016.
 */
public class OGNLTest {
    @Test
    public void testOgnl() throws Exception {
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.put("key", "test");
        Object ognl = Ognl.parseExpression("#key");
        Object value = Ognl.getValue(ognl, ognlContext, ognlContext.getRoot());
        System.out.println(value);
    }

}
