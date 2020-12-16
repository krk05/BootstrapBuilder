package pl.put.poznan.builder.logic;

public class RuchomyNaglowek implements Page {
    @Override
    public String poczatek(){return ""; }

    @Override
    public String zwykleMeta() {
        return "";
    }

    @Override
    public String twitterMeta(){
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
        return "<script>\n" +
                "window.onscroll = function() {myFunction()};\n" +
                "\n" +
                "var header = document.getElementById(\"myHeader\");\n" +
                "var sticky = header.offsetTop;\n" +
                "\n" +
                "function myFunction() {\n" +
                "  if (window.pageYOffset > sticky) {\n" +
                "    header.classList.add(\"sticky\");\n" +
                "  } else {\n" +
                "    header.classList.remove(\"sticky\");\n" +
                "  }\n" +
                "}\n" +
                "</script>\n";
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
