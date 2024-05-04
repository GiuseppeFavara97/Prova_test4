import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String dateString = "2023-03-01T13:00:00Z";
        
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);
        
        String  yearFormatterDate = parseYearFormatter(dateTime);
        String  monthFormatterDate = parseMonthFormatter(dateTime);
        String  dayFormatterDate = parseDayFormatter(dateTime);
        String  dayOfTheWeek = parseDayOfTheWeek(dateTime);

        System.out.println("Anno: " + yearFormatterDate);
        System.out.println("Mese: " + monthFormatterDate);
        System.out.println("Giorno: " + dayFormatterDate);
        System.out.println("Giorno della settimana: " + dayOfTheWeek);
    }

    static String parseYearFormatter(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy"));
    }

    static String parseMonthFormatter(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("MMMM"));
    }

    static String parseDayFormatter(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("dd"));
    }

    static String parseDayOfTheWeek(OffsetDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ofPattern("EEEE"));
    }

    public static OffsetDateTime parseData(String dataString) {
        return OffsetDateTime.parse(dataString);
    }
}