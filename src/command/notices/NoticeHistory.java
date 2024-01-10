package command.notices;

import java.util.Stack;

public class NoticeHistory {
    private Stack<Notice> history = new Stack<>();

    public void push(Notice n) {
        history.push(n);
    }

    public Notice pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
