package CheckText;

public class CheckText {
    public static void main(String[] args) {
        String[] text =
                {
                        "bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb",
                        " quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s",
                        " pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag",
                        "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx",
                        "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba",
                        " auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk",
                        " cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd",
                        "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob",
                        "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf",
                        "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan",
                        "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv",
                        "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq",
                        " ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh",
                        "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk",
                        "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa",
                        "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb",
                        "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs"
                };

        checkString(6, text);
    }

    public static void checkString(int value, String[] text) {
        if (value > text.length)
            System.out.println("К сожалению, в тексте всего: " + text.length + " строк.");
        else if (value <= 0)
            System.out.println("Подсчета символов не будет, т.к. кол-во строк для подсчета меньше 0 или равно 0");
        else
            for (int i = 0; i < value; i++) {
                int quantity = 0;
                char[] chars = text[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char aChar = chars[j];
                    if (aChar == 'a' || aChar == 'o' || aChar == 'u' || aChar == 'i' || aChar == 'e' || aChar == 'y')
                        quantity++;
                }
                System.out.println("Количество гласных для строки " + (i + 1) + " равно " + quantity);
            }
    }
}

