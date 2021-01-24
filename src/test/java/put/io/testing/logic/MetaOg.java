package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MetaOg {

    private String result;
    private Page tester;
    private ArrayList<String> var = new ArrayList<String>();
    private String metaFragment;

    @BeforeEach
    public void setUp(){
        this.var.add("title");
        this.var.add("description");
        this.var.add("image");
        this.var.add("url");
        this.metaFragment = "<meta property=\"og:title\" content=\"" + this.var.get(0) + "\">\n" +
                "<meta property=\"og:description\" content=\"" + this.var.get(1) + "\">\n" +
                "<meta property=\"og:image\" content=\"" + this.var.get(2) + "\">\n" +
                "<meta property=\"og:url\" content=\"" + this.var.get(3) + "\">\n\n";
    }

    @Test
    public void testEmptyMetaOg(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.MetaOg(this.var.get(0), this.var.get(1), this.var.get(2), this.var.get(3), this.result);
        assertEquals(this.metaFragment, this.tester.addSection());
    }

    @Test
    public void testNotEmptyMetaOg(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.MetaOg(this.var.get(0), this.var.get(1), this.var.get(2), this.var.get(3), this.result);
        assertEquals(this.result + this.metaFragment, this.tester.addSection());
    }
}
