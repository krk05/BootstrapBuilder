package pl.put.poznan.builder.logic;

public class Middle implements Page {

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
     * Adds to code the body part without ending it
     *
     * @return s text of HTML page's code
     */
    @Override
    public String addSection() {
        String s = code + "</head>\n<body>\n\n";
        return s;
    }
}
