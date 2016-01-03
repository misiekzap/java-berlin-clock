package com.ubs.opsit.interviews.converters;
import static com.ubs.opsit.interviews.BerlinClockConstants.*;

public class FiveHourPartConverter implements PartConverter {

	@Override
	public String convertPartTime(int partTime) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			if (partTime >= FIVE_WEIGHT) {
				buffer.append(RED_LAMP);
				partTime -= FIVE_WEIGHT;
			} else {
				buffer.append(IDLE_LAMP);
			}
		}
		buffer.append(NEW_LINE);
		return buffer.toString();
	}
	
}
