package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class Object {

    private String result;
    private Page tester;
    private String object;

    @BeforeEach
    public void setUp(){
        this.object =  "<main>\n" +
                "   <div class=\"container\">\n" +
                "       GLOWNY AKAPIT\n" +
                "   </div>\n" +
                "</main>\n\n";
    }

    @Test
    public void testEmptyObject(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.Object(this.result);
        assertEquals(this.object, this.tester.addSection());
    }

    @Test
    public void testNotEmptyObject(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.Object(this.result);
        assertEquals(this.result + this.object, this.tester.addSection());
    }
}
