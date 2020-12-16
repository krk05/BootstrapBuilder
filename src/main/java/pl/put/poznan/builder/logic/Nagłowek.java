package pl.put.poznan.builder.logic;

public class Nagłowek implements Page {
    @Override
    public String poczatek(){ return ""; }

    @Override
    public String zwykleMeta() {
        return "";
    }

    @Override
    public String twitterMeta() {
        return "";
    }

    @Override
    public String ogMeta() {
        return "";
    }

    @Override
    public String pomiedzy() {
        return "";
    }

    @Override
    public String naglowek() {
        return "<nav class=\"navbar navbar-expand-md navbar-dark bg-dark \" id=\"myHeader\">\n" +
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

    @Override
    public String fixed() {
        return "";
    }

    @Override
    public String akapit() {
        return "";
    }

    @Override
    public String stopka() {
        return "";
    }

    @Override
    public String koniec() { return ""; }
}
