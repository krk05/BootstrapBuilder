package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class Header {

    private String result;
    private Page tester;
    private String header;

    @BeforeEach
    public void setUp() {
        this.header = "<nav class=\"navbar navbar-expand-md navbar-dark bg-dark \" id=\"myHeader\">\n" +
                "      <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n" +
                "      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "        <span class=\"navbar-toggler-icon\"></span>\n" +
                "      </button>\n" +
                "      <div class=\"collapse navbar-collapse\" id=\"navbarsExampleDefault\">\n" +
                "        <ul class=\"navbar-nav mr-auto\">\n" +
                "          <li class=\"nav-item active\">\n" +
                "            <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n" +
                "          </li>\n" +
                "          <li class=\"nav-item\">\n" +
                "            <a class=\"nav-link\" href=\"#\">Link</a>\n" +
                "          </li>\n" +
                "          <li class=\"nav-item\">\n" +
                "            <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n" +
                "          </li>\n" +
                "          <li class=\"nav-item dropdown\">\n" +
                "            <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"dropdown01\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Dropdown</a>\n" +
                "            <div class=\"dropdown-menu\" aria-labelledby=\"dropdown01\">\n" +
                "              <a class=\"dropdown-item\" href=\"#\">Action</a>\n" +
                "              <a class=\"dropdown-item\" href=\"#\">Another action</a>\n" +
                "              <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n" +
                "            </div>\n" +
                "          </li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "    </nav>\n";
    }

    @Test
    public void testEmptyHeader(){
        this.result = "";
        this.tester = new pl.put.poznan.builder.logic.Header(this.result);
        assertEquals(this.header, this.tester.addSection());
    }

    @Test
    public void testNotEmptyHeader(){
        this.result = "abcd";
        this.tester = new pl.put.poznan.builder.logic.Header(this.result);
        assertEquals(this.result + this.header, this.tester.addSection());
    }
}
