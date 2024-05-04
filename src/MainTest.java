import org.junit.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class MainTest {

    @Test
    public void testParseDate() {
        String dataString = "2002-03-01T13:00:00Z";
        OffsetDateTime dataTime = Main.parseData(dataString);
        OffsetDateTime expectedDate = OffsetDateTime.parse(dataString);

        assertEquals(expectedDate, dataTime);
    }
    @Test
    public void testParseInvalidDate(){
        String invalidDataString = "InvalidData";
        assertThrows(DateTimeException.class, () -> Main.parseData(invalidDataString));
    }
    @Test
    public void yearTestFormatter() {
        OffsetDateTime dataTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formatterData = Main.parseYearFormatter(dataTime);
        String expectedFormatterDate = dataTime.format(DateTimeFormatter.ofPattern("yyyy"));
        assertEquals(expectedFormatterDate, formatterData);
    }
    @Test
    public void monthTestFormatter() {
        OffsetDateTime dataTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formatterData = Main.parseMonthFormatter(dataTime);
        String expectedFormatterDate = dataTime.format(DateTimeFormatter.ofPattern("MMMM"));
        assertEquals(expectedFormatterDate, formatterData);
    }
    @Test
    public void dayTestFormatter() {
        OffsetDateTime dataTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formatterData = Main.parseDayFormatter(dataTime);
        String expectedFormatterDate = dataTime.format(DateTimeFormatter.ofPattern("dd"));
        assertEquals(expectedFormatterDate, formatterData);
    }
    @Test
    public void dayOfTheWeekTestFormatter() {
        OffsetDateTime dataTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String formatterData = Main.parseDayOfTheWeek(dataTime);
        String expectedFormatterDate = dataTime.format(DateTimeFormatter.ofPattern("EEEE"));
        assertEquals(expectedFormatterDate, formatterData);
    }
}