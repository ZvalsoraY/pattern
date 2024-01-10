package command.notices;

import command.sender.Sender;

public class EmailNotice extends Notice{
    public EmailNotice(Sender sender) {
        super(sender);
    }

    @Override
    public boolean send() {
        System.out.println("EmailNotice class");
        return true;
    }
}
