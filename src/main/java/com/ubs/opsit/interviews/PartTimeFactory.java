package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.converters.EvenSecondPartConverter;
import com.ubs.opsit.interviews.converters.FiveHourPartConverter;
import com.ubs.opsit.interviews.converters.FiveMinutePartConverter;
import com.ubs.opsit.interviews.converters.PartConverter;
import com.ubs.opsit.interviews.converters.SingleHourPartConverter;
import com.ubs.opsit.interviews.converters.SingleTimePartConverter;
import static com.ubs.opsit.interviews.BerlinClockConstants.*;

public class PartTimeFactory {
	private EvenSecondPartConverter evenSecondPartConverter = null;
	private FiveHourPartConverter fiveHourPartConverter = null;
	private SingleHourPartConverter singleHourPartConverter = null;
	private FiveMinutePartConverter fiveMinutePartConverter = null;
	private SingleTimePartConverter singleMinutePartConverter = null;

	
	public PartConverter createEvenSecondPartConverter() {
		if (evenSecondPartConverter == null) {
			evenSecondPartConverter = new EvenSecondPartConverter();
		}
		return evenSecondPartConverter;
	}

	public PartConverter createFiveHourPartConverter() {
		if (fiveHourPartConverter == null) {
			fiveHourPartConverter = new FiveHourPartConverter();
		}
		return fiveHourPartConverter;
	}
	
	public PartConverter createSingleHourPartConverter() {
		if (singleHourPartConverter == null) {
			singleHourPartConverter = new SingleHourPartConverter(RED_LAMP);
		}
		return singleHourPartConverter;
	}
	
	public PartConverter createFiveMinutePartConverter() {
		if (fiveMinutePartConverter == null) {
			fiveMinutePartConverter = new FiveMinutePartConverter();
		}
		return fiveMinutePartConverter;
	}
	
	public PartConverter createSingleMinutePartConverter() {
		if (singleMinutePartConverter == null) {
			singleMinutePartConverter = new SingleTimePartConverter(YELLOW_LAMP);
		}
		return singleMinutePartConverter;
	}
}
