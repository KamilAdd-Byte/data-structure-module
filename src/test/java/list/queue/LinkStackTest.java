package list.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkStackTest {

    private LinkStack linkStack;
    @Test
    void pushItem() {
        linkStack = getLinkStack();
        assertEquals(432L, linkStack.getTop());
        assertEquals(5, linkStack.size());

        linkStack.pop();
        linkStack.pop();

        assertEquals(3, linkStack.size());
        assertEquals(22L, linkStack.getTop());
    }

    private LinkStack getLinkStack() {
        LinkStack linkStack = new LinkStack();
        linkStack.push(21L);
        linkStack.push(211L);
        linkStack.push(22L);
        linkStack.push(65L);
        linkStack.push(432L);
        return linkStack;
    }

    @Test
    void pop() {
    }
}