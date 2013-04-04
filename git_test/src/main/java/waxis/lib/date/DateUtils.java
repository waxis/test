package waxis.lib.date;

import java.util.Date;

import org.apache.commons.lang.time.FastDateFormat;

public class DateUtils {

	private static FastDateFormat FORMAT = FastDateFormat.getInstance("yyyy");

	public static String format(Date date) {
		return FORMAT.format(date);
	}

}
