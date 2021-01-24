package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import static org.junit.jupiter.api.Assertions.*;

public class Footer {

    private String result;
    private Page tester;
    private String cssFooter;
    private String htmlFooter;

    @BeforeEach
    public void setUp() {
        this.cssFooter = "footer {\n" +
                "   color: white;\n" +
                "   line-height: 50px;\n" +
                "   padding: 0 20px;\n" +
                "   background: #42A5F5\n" +
                "}\n\n";
        this.htmlFooter = "<footer class=\"container-fluid bg-4 text-center\">\n" +
                "   <p>Bootstrap Footer</p>\n" +
                "</footer>\n\n";
    }

    @Test
    public void testNotEmptyFooter(){
        this.result = "</style>";
        this.tester = new pl.put.poznan.builder.logic.Footer(this.result);
        assertEquals(this.cssFooter + this.result + this.htmlFooter, this.tester.addSection());
    }
}
