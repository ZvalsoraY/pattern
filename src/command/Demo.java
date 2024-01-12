package command;


import command.notices.EmailNotice;
import command.notices.NoticeHistory;
import command.notices.SmsNotice;
import command.sender.Sender;

public class Demo {
    public static void main(String[] args) {
        Sender sender = new Sender();

        sender.executeCommand(new SmsNotice(sender));
        sender.executeCommand(new EmailNotice(sender));
        System.out.println(sender.history.toString());
    }
}
