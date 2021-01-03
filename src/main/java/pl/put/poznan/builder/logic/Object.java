package pl.put.poznan.builder.logic;

/**
 *  Implements the content of object to the HTML page's code
 */
public class Object implements Page {
    String code;

    /**
     * Class constructor
     *
     * @param code text of the HTML page's code
     */
    public Object(String code)
    {
        this.code = code;
    }

    /**
     * Adds to code the object (div) to the code
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {
        return code +   "<main>\n" +
                "   <div class=\"container\">\n" +
                "       GLOWNY AKAPIT\n" +
                "   </div>\n" +
                "</main>\n\n";
    }
}
