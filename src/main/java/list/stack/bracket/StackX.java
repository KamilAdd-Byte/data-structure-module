package list.stack.bracket;

import message.MessageFormatObtainer;
import java.util.logging.Logger;

public class StackX {
    private static final Logger logger = Logger.getLogger(StackX.class.getName());
    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int s) {
        this.maxSize = s;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }



    public void push (long j){ //Wkładamy element na stos
        stackArray[++top] = j;
    }

    public long pop(){ // pobiera wartośc elementu ze szczytu stosu
        return stackArray[top--];
    }

    public long peek () { // podglada zawartośc elementu na szczycie stosu
        return stackArray[top];
    }

    public boolean isEmpty () {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize-1);
    }

    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);
        long peek = theStack.peek();
        System.out.println(peek);

    while (!theStack.isEmpty()){
        long value = theStack.pop();
        System.out.print(value);
        System.out.print(" :  ");
    }
        System.out.println("");
        MessageFormatObtainer formatObtainer = new MessageFormatObtainer();
// Exercises at 28032023 date.
    for (int i = 1; i < 20; i = i + 3){
        formatObtainer.setNumber(i);
        logger.info(formatObtainer.formatForIntegerValue());
        }
    }
}
