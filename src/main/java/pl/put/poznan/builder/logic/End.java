package pl.put.poznan.builder.logic;

/**
 * Implements the content of body closing section to the HTML page's code
 */
public class End implements Page {
    /**
     * stores the code of HTML's page
     */
    String code;

    /**
     * Class constructor
     *
     * @param code text of the HTML page's code
     */
    public End(String code)
    {
        this.code = code;
    }

    /**
     * Adds to the code the code of HTML page's end code
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {
        return code +   "</body>\n" +
                "</html>\n";
    }
}
