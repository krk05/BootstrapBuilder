package pl.put.poznan.builder.logic;

public class obiekt implements page {
    @Override
    public String poczatek(){return ""; }

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
        return "";
    }

    @Override
    public String fixed() {
        return ""; }

    @Override
    public String akapit() {
        return "<main>\n" +
                "<div class=\"container\">GLOWNY AKAPIT</div></main>\n";
    }

    @Override
    public String stopka() {
        return "";
    }

    @Override
    public String koniec() { return ""; }
}
