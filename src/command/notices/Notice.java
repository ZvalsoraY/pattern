package command.notices;

import command.sender.Sender;

public abstract class Notice {
    public Sender sender;
    private String backup;
    Notice(Sender sender) {
        this.sender = sender;
    }
    public abstract boolean send();
}
