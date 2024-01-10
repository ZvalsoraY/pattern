package command.sender;

import command.notices.EmailNotice;
import command.notices.Notice;
import command.notices.NoticeHistory;
import command.notices.SmsNotice;

public class Sender {
    private NoticeHistory history = new NoticeHistory();

    public void init() {
        Sender sender = this;
        executeCommand(new SmsNotice(sender));
        executeCommand(new EmailNotice(sender));

    }

    private void executeCommand(Notice notice) {
        if (notice.send()) {
            history.push(notice);
        }
    }

}
