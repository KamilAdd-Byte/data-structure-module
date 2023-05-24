package list.stack.bracket;

public class BracketChecker {
    private final String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        StackX stackX = new StackX(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char charAt = input.charAt(j);


            switch (charAt) {
                case '{':
                case '[':
                case '(':
                    stackX.push(charAt);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stackX.isEmpty()) {
                        //TODO Algorytmy Stack pdr.

                    }

            }
        }


    }


}
