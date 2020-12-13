package pl.put.poznan.builder.logic;

public class poczatek implements page {
    @Override
    public String poczatek(){
        String s = "<!DOCTYPE html>\n<html>\n<head>\n<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n" +
                "<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n" +
                "<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script><style>\n" +
                "\n" +
                "\n" +
                ".sticky {\n" +
                "  position: fixed;\n" +
                "  top: 0;\n" +
                "  width: 100%;\n" +
                "}\n" +
                "\n" +
                "</style>\n";
        return s;
    }

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
