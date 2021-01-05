package pl.put.poznan.builder.logic;

/**
 * Implements the content of body closing head section and starting the body section to the HTML page's code
 */
public class Middle implements Page {
    /**
     * stores the code of HTML's page
     */
    String code;

    /**
     *  Class constructor
     *
     * @param code text of the HTML page's code
     */
    public Middle(String code)
    {
        this.code = code;
    }

    /**
     * Ends the "head" part and starts the body part without ending it
     *
     * @return s text of HTML page's code
     */
    @Override
    public String addSection() {
        String s = code + "</head>\n<body>\n\n";
        return s;
    }
}
