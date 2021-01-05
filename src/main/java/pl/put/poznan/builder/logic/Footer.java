package pl.put.poznan.builder.logic;
/**
 *  Implements the content of footer to the HTML page's code
 */
public class Footer implements Page {
    /**
     * stores the code of HTML's page
     */
    String code;

    /**
     * Class constructor
     *
     * @param code text of the HTML page's code
     */
    public Footer(String code)
    {
        this.code = code;
    }

    /**
     * Adds to the code the code of footer
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {

        String htmlFooterClass =
                "footer {\n" +
                        "   color: white;\n" +
                        "   line-height: 50px;\n" +
                        "   padding: 0 20px;\n" +
                        "   background: #42A5F5\n" +
                        "}\n\n";

        int index = code.indexOf("</style>");

        if (index  < 0){
            htmlFooterClass = "<style>\n\n" + htmlFooterClass + "</style>\n\n";
            index = code.indexOf("</head>");
        }

        String htmlFooter =     "<footer class=\"container-fluid bg-4 text-center\">\n" +
                "   <p>Bootstrap Footer</p>\n" +
                "</footer>\n\n";


        code =  code.substring(0, index) +
                htmlFooterClass +
                code.substring(index) +
                htmlFooter;

        return code;
    }
}
