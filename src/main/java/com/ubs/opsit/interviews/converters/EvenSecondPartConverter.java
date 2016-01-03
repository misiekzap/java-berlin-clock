package com.ubs.opsit.interviews.converters;
import static com.ubs.opsit.interviews.BerlinClockConstants.*;

public class EvenSecondPartConverter implements PartConverter {

	@Override
	public String convertPartTime(int partTime) {
		StringBuffer buffer = new StringBuffer();
		buffer.append((partTime % 2 == 0) ? YELLOW_LAMP : IDLE_LAMP);
		buffer.append(NEW_LINE);
		return buffer.toString();
	}
	
}
