package put.io.testing.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.builder.logic.Page;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BootstrapBuilder {

    private String fragment;
    private pl.put.poznan.builder.logic.BootstrapBuilder bootstrapBuilder;

    @BeforeEach
    public void setUp(){
        this.bootstrapBuilder = new pl.put.poznan.builder.logic.BootstrapBuilder();
        this.fragment = "";
    }


    @Test
    public void startAddSection(){
        this.fragment =  "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n\n"  +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
                "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n" +
                "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script> \n\n";


        assertEquals(this.fragment, this.bootstrapBuilder.initPage());
    }

    @Test
    public void objectAddSection(){
        this.fragment =  "<main>\n" +
                "   <div class=\"container\">\n" +
                "       GLOWNY AKAPIT\n" +
                "   </div>\n" +
                "</main>\n\n";

        assertEquals(this.fragment, this.bootstrapBuilder.addObject(""));
    }

    @Test
    public void middleAddSection(){
        this.fragment =  "</head>\n<body>\n\n";

        assertEquals(this.fragment, this.bootstrapBuilder.addMiddle(""));
    }

    @Test
    public void metaTwitterAddSection(){
        ArrayList<String> var = new ArrayList<String>();
        var.add("title");
        var.add("description");
        var.add("image");
        var.add("card");
        this.fragment =  "<meta name=\"twitter:title\" content=\"" + var.get(0) + "\">\n" +
                "<meta name=\"twitter:description\" content=\"" + var.get(1) + "\">\n" +
                "<meta name=\"twitter:image\" content=\"" + var.get(2) + "\">\n" +
                "<meta name=\"twitter:card\" content=\"" + var.get(3) + "\">\n\n";

        assertEquals(this.fragment, this.bootstrapBuilder.addMetaTwitter(var.get(0), var.get(1), var.get(2), var.get(3), ""));
    }

    @Test
    public void metaOgAddSection(){
        ArrayList<String> var = new ArrayList<String>();
        var.add("title");
        var.add("description");
        var.add("image");
        var.add("url");
        this.fragment =  "<meta property=\"og:title\" content=\"" + var.get(0) + "\">\n" +
                "<meta property=\"og:description\" content=\"" + var.get(1) + "\">\n" +
                "<meta property=\"og:image\" content=\"" + var.get(2) + "\">\n" +
                "<meta property=\"og:url\" content=\"" + var.get(3) + "\">\n\n";

        assertEquals(this.fragment, this.bootstrapBuilder.addMetaOg(var.get(0), var.get(1), var.get(2), var.get(3), ""));
    }

    @Test
    public void metaTagsAddSection(){
        ArrayList<String> var = new ArrayList<String>();
        var.add("title");
        var.add("description");
        var.add("keywords");
        this.fragment =  "<title>" + var.get(0) + "</title>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<meta name=\"description\" content=\"" + var.get(1) + "\">\n" +
                "<meta name=\"keywords\" content=\"" + var.get(2) + "\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n\n";

        assertEquals(this.fragment, this.bootstrapBuilder.addMetaTags(var.get(0), var.get(1), var.get(2), ""));
    }

    @Test
    public void headerAddSection(){
        this.fragment =  "<nav class=\"navbar navbar-expand-md navbar-dark bg-dark \" id=\"myHeader\">\n" +
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

        assertEquals(this.fragment, this.bootstrapBuilder.addHeader(""));
    }

    @Test
    public void footerAddSection(){
        this.fragment =  "footer {\n" +
                "   color: white;\n" +
                "   line-height: 50px;\n" +
                "   padding: 0 20px;\n" +
                "   background: #42A5F5\n" +
                "}\n\n" +
                "</style>" +
                "<footer class=\"container-fluid bg-4 text-center\">\n" +
                "   <p>Bootstrap Footer</p>\n" +
                "</footer>\n\n";

        assertEquals(this.fragment, this.bootstrapBuilder.addFooter("</style>"));
    }

    @Test
    public void fixedHeaderAddSection(){
        this.fragment = "\n<style>\n" +
                ".sticky {\n" +
                "   position: fixed;\n" +
                "   top: 0;\n" +
                "   width: 100%;\n" +
                "}\n" +
                "</style>\n\n" +
                "</head> abcd" +
                "<nav class=\"navbar navbar-expand-md navbar-dark bg-dark \" id=\"myHeader\">\n" +
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
                "    </nav>\n" +
                "\n<script>\n" +
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

        assertEquals(this.fragment, this.bootstrapBuilder.addFixedHeader("</head> abcd"));
    }

    @Test
    public void endAddSection(){
        this.fragment =  "</body>\n" +
                "</html>\n";

        assertEquals(this.fragment, this.bootstrapBuilder.closeTags(""));
    }

}
