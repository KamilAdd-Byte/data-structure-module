import io.vavr.control.Option;

public class OptionVAVRExample {
    public static void main(String[] args) {
        String example = "Sraczka";

        String orElse = Option.of(example)
                .map("Bywa niebezpieczna "::concat)
                .getOrElse("c");

        System.out.println(example);
        System.out.println(orElse);
    }
}
