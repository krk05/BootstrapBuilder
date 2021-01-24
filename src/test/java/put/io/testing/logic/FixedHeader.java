package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class FixedHeader {

    private String result;
    private Page tester;
    private String htmlStickyClass;
    private String javascriptOnRollFunction;

    @BeforeEach
    public void setUp(){
        this.htmlStickyClass = "\n<style>\n" +
                ".sticky {\n" +
                "   position: fixed;\n" +
                "   top: 0;\n" +
                "   width: 100%;\n" +
                "}\n" +
                "</style>\n\n";

        this.javascriptOnRollFunction = "\n<script>\n" +
                "window.onscroll = function() {myFunction()};\n" +
                "\n" +
                "var header = document.getElementById(\"myHeader\");\n" +
                "var sticky = header.offsetTop;\n" +
                "\n" +
                "function myFunction() {\n" +
                "  if (window.pageYOffset > sticky) {\n" +
                "    header.classList.add(\"sticky\");\n" +
                "  } else {\n" +
                "    header.classList.remove(\"sticky\");\n" +
                "  }\n" +
                "}\n" +
                "</script>\n\n";
    }

    @Test
    public void testNotEmptyFixedHeader(){
        this.result = "</head> abcd";
        this.tester = new pl.put.poznan.builder.logic.FixedHeader(this.result);
        assertEquals(this.htmlStickyClass + this.result + this.javascriptOnRollFunction, this.tester.addSection());
    }
}
