package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MetaTwitter {

    private String result;
    private Page tester;
    private ArrayList<String> var = new ArrayList<String>();
    private String metaFragment;

    @BeforeEach
    public void setUp(){
        this.var.add("title");
        this.var.add("description");
        this.var.add("image");
        this.var.add("card");
        this.metaFragment =  "<meta name=\"twitter:title\" content=\"" + this.var.get(0) + "\">\n" +
                "<meta name=\"twitter:description\" content=\"" + this.var.get(1) + "\">\n" +
                "<meta name=\"twitter:image\" content=\"" + this.var.get(2) + "\">\n" +
                "<meta name=\"twitter:card\" content=\"" + this.var.get(3) + "\">\n\n";
    }

    @Test
    public void testEmptyMetaTwitter(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.MetaTwitter(this.var.get(0), this.var.get(1), this.var.get(2),  this.var.get(3), this.result);
        assertEquals(this.metaFragment, this.tester.addSection());
    }

    @Test
    public void testNotEmptyMetaTwitter(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.MetaTwitter(this.var.get(0), this.var.get(1), this.var.get(2), this.var.get(3), this.result);
        assertEquals(this.result + this.metaFragment, this.tester.addSection());
    }
}
