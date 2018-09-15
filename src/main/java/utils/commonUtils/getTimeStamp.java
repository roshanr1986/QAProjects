package utils.commonUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class getTimeStamp {
    static LocalDateTime time;
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");

    public String getTimeStamp(){
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);

    }
}
