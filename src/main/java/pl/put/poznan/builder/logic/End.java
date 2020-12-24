package pl.put.poznan.builder.logic;
public class End implements Page {
    String code;

    public End(String code)
    {
        this.code = code;
    }

    @Override
    public String addSection() {
        return code +   "</body>\n" +
                "</html>\n";
    }
}
