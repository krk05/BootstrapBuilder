package pl.put.poznan.builder.logic;

/**
 * Implements the content of header to the HTML page's code
 */
public class Header implements Page {
    String code;

    /**
     * Class constructor
     *
     * @param code code of HTML page
     */
    public Header(String code)
    {
        this.code = code;
    }

    /**
     * Adds to the code header's body section
     *
     * @return code of HTML page
     */
    @Override
    public String addSection() {
        return code +  "<nav class=\"navbar navbar-expand-md navbar-dark bg-dark \" id=\"myHeader\">\n" +
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
}
