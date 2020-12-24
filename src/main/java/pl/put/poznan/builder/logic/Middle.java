package pl.put.poznan.builder.logic;

public class Middle implements Page {

    String code;

    public Middle(String code)
    {
        this.code = code;
    }

    @Override
    public String addSection() {
        String s = code + "</head>\n<body>\n\n";
        return s;
    }
}
