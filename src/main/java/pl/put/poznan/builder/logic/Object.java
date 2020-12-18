package pl.put.poznan.builder.logic;

public class Object implements Page {
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
        return "<main>\n" +
                "<div class=\"container\">GLOWNY paragraph</div></main>\n";
    }

    @Override
    public String footer() {
        return "";
    }

    @Override
    public String end() { return ""; }
}
