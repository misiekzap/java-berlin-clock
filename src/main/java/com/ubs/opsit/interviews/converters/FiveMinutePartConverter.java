package com.ubs.opsit.interviews.converters;
import static com.ubs.opsit.interviews.BerlinClockConstants.FIVE_WEIGHT;
import static com.ubs.opsit.interviews.BerlinClockConstants.IDLE_LAMP;
import static com.ubs.opsit.interviews.BerlinClockConstants.NEW_LINE;
import static com.ubs.opsit.interviews.BerlinClockConstants.RED_LAMP;
import static com.ubs.opsit.interviews.BerlinClockConstants.YELLOW_LAMP;

public class FiveMinutePartConverter implements PartConverter {

	@Override
	public String convertPartTime(int partTime) {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 11; i++) {
			if (partTime >= FIVE_WEIGHT) {
				String color = chooseRedOrYellowLamp(i);
				partTime -= FIVE_WEIGHT;
				buffer.append(color);
			} else {
				buffer.append(IDLE_LAMP);
			}
		}
		buffer.append(NEW_LINE);
		return buffer.toString();
	}

	private String chooseRedOrYellowLamp(int i) {
		return (i % 3 == 2) ? RED_LAMP : YELLOW_LAMP;
	}

}
