package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class End {

    private String result;
    private Page tester;
    private String fragment;

    @BeforeEach
    public void setUp(){
        this.fragment = "</body>\n" +
                "</html>\n";
    }

    @Test
    public void testEmptyEnd(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.End(this.result);
        assertEquals(this.fragment, this.tester.addSection());
    }

    @Test
    public void testNotEmptyEnd(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.End(this.result);
        assertEquals(this.result + this.fragment, this.tester.addSection());
    }
}
