package pl.put.poznan.builder.logic;

/**
 *  Implements the content of fixed header to the HTML page's code
 */
public class FixedHeader implements Page {

    String code;

    /**
     * Class constructor
     *
     * @param code text of the HTML page's code
     */
    public FixedHeader(String code)
    {
        this.code = code;
    }

    /**
     * Adds to code the section of fixed header
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {

        String htmlStickyClass =    "\n<style>\n" +
                ".sticky {\n" +
                "   position: fixed;\n" +
                "   top: 0;\n" +
                "   width: 100%;\n" +
                "}\n" +
                "</style>\n\n";

        String javascriptOnRollFunction =   "\n<script>\n" +
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

        int index = code.indexOf("</head>");

        code =  code.substring(0, index) +
                htmlStickyClass +
                code.substring(index) +
                javascriptOnRollFunction;

        return code;
    }
}
