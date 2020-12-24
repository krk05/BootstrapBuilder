package pl.put.poznan.builder.logic;

public class Object implements Page {
    String code;

    public Object(String code)
    {
        this.code = code;
    }

    @Override
    public String addSection() {
        return code +   "<main>\n" +
                "   <div class=\"container\">\n" +
                "       GLOWNY AKAPIT\n" +
                "   </div>\n" +
                "</main>\n\n";
    }
}
