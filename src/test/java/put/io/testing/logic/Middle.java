package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class Middle {

    private String result;
    private Page tester;
    private String middle;

    @BeforeEach
    public void setUp(){
        this.middle =  "</head>\n<body>\n\n";
    }

    @Test
    public void testEmptyMiddle(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.Middle(this.result);
        assertEquals(this.middle, this.tester.addSection());
    }

    @Test
    public void testNotEmptyMiddle(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.Middle(this.result);
        assertEquals(this.result + this.middle, this.tester.addSection());
    }
}
