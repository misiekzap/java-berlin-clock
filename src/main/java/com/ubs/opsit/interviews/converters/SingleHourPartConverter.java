package com.ubs.opsit.interviews.converters;
import static com.ubs.opsit.interviews.BerlinClockConstants.*;

public class SingleHourPartConverter extends SingleTimePartConverter {

	public SingleHourPartConverter(String color) {
		super(color);
	}

	@Override
	public String convertPartTime(int partTime) {
		return super.convertPartTime(partTime) + NEW_LINE;
	}
}
