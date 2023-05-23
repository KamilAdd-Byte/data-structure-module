import io.vavr.control.Option;

public class OptionVAVRExample {
    public static void main(String[] args) {
        String example = "Word";

        String concat = Option.of(example)
                .map("Added before word"::concat)
                .getOrElse("c");
    }
}
