package command.notices;

import command.sender.Sender;

public class SmsNotice extends Notice{
    public SmsNotice(Sender sender) {
        super(sender);
    }

    @Override
    public boolean send() {
        System.out.println("SmsNotice class");
        return true;
    }
}
