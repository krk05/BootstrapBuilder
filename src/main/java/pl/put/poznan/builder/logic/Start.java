package pl.put.poznan.builder.logic;

public class Start implements Page {
    @Override
    public String start(){
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
    public String simpleMeta() {
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
    public String middle() {
        return "";
    }

    @Override
    public String header() {
        return "";
    }

    @Override
    public String fixed() {
        return "";
    }

    @Override
    public String paragraph() {
        return "";
    }

    @Override
    public String footer() {
        return "";
    }

    @Override
    public String end() { return ""; }
}
