package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Metatags {

    private String result;
    private Page tester;
    private ArrayList<String> var = new ArrayList<String>();
    private String metaFragment;

    @BeforeEach
    public void setUp(){
        this.var.add("title");
        this.var.add("description");
        this.var.add("keywords");
        this.metaFragment =  "<title>" + this.var.get(0) + "</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"description\" content=\"" + this.var.get(1) + "\">\n" +
                "<meta name=\"keywords\" content=\"" + this.var.get(2) + "\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n\n";
    }

    @Test
    public void testEmptyMetatags(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.Metatags(this.var.get(0), this.var.get(1), this.var.get(2), this.result);
        assertEquals(this.metaFragment, this.tester.addSection());
    }

    @Test
    public void testNotEmptyMetatags(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.Metatags(this.var.get(0), this.var.get(1), this.var.get(2), this.result);
        assertEquals(this.result + this.metaFragment, this.tester.addSection());
    }
}
