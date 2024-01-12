package command.sender;

import command.notices.EmailNotice;
import command.notices.Notice;
import command.notices.NoticeHistory;
import command.notices.SmsNotice;

public class Sender {
    public NoticeHistory history = new NoticeHistory();

    public void executeCommand(Notice notice) {
        if (notice.send()) {
            history.push(notice);
        }
    }

}
