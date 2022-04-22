import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class String0Test {
private static final ByteArrayOutputStream out = new ByteArrayOutputStream();
private static final PrintStream origOut=System.out;

@BeforeClass
public static void setupStream()
        {System.setOut(new PrintStream(out));}

@AfterClass
public static void restoreStream()
{System.setOut(origOut);}

@Test
public void test(){
    //System.out.print("hello");
    String0.main(new String[]{});
    Assertions.assertEquals("Original String : w3resource.com\r\n" +
            "Character(unicode point) = 51\r\n" +
            "Character(unicode point) = 101\r\n",out.toString());
   // out.reset();
    //System.setOut(origOut);
}
@Test
    public void getIndexUtf(){
Assertions.assertEquals(51,"w3resourse.com".codePointAt(1));

}
}
