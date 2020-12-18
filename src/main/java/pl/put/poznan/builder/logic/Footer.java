package pl.put.poznan.builder.logic;

public class Footer implements Page {
    @Override
    public String start(){return ""; }

    @Override
    public String simpleMeta() {
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
    public String middle() {
        return "";
    }

    @Override
    public String header() {
        return "";
    }

    @Override
    public String fixed() {
        return ""; }

    @Override
    public String paragraph() {
        return "";
    }

    @Override
    public String footer() {
        return "<footer class=\"container-fluid bg-4 text-center\" style=\" color: white; background: #42A5F5 ;\n" +
                "        color: white;\n" +
                "        line-height: 50px;\n" +
                "        padding: 0 20px;    \">\n" +
                "  <p>Bootstrap Theme Made By <a href=\"https://www.w3schools.com\">www.w3schools.com</a></p> \n" +
                "</footer>";
    }

    @Override
    public String end() { return ""; }
}
