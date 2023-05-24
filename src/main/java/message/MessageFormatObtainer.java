package message;

import java.text.MessageFormat;

public class MessageFormatObtainer {
    private int number;
    private String value;

    public MessageFormatObtainer() {
    }

    private MessageFormatObtainer(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public MessageFormatObtainer(int number) {
        this.number = number;
    }

    public MessageFormatObtainer(String value) {
        this.value = value;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String formatForStringValue () {
        return MessageFormat.format("This is my value of String type: {0}", value);
    }

    public String formatForIntegerValue () {
        return MessageFormat.format("This is my value of Integer type: {0}", number);
    }
}
