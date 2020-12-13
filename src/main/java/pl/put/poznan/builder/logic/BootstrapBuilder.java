package pl.put.poznan.builder.logic;

public class BootstrapBuilder {
    //    public static void main(String[] args) {
//        transform();
//    }
    private page a;
    public BootstrapBuilder(page a){
        this.a=a;
    }

    public static String wywolanie(page a)
    {
        String w = "";
        w = w + a.poczatek();
        w = w + a.zwykleMeta();
        w = w + a.twitterMeta();
        w = w + a.ogMeta();
        w = w + a.naglowek();
        w = w + a.fixed();
        w = w + a.pomiedzy();
        w = w + a.akapit();
        w = w + a.stopka();
        w = w + a.koniec();
        return w;
    }
}




