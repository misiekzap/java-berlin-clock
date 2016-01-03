package com.ubs.opsit.interviews.converters;
import static com.ubs.opsit.interviews.BerlinClockConstants.*;

public class SingleTimePartConverter implements PartConverter {
	private String color;
	
	public SingleTimePartConverter(String color) {
		this.color = color;
	}

	@Override
	public String convertPartTime(int partTime) {
		StringBuffer buffer = new StringBuffer();
		partTime = partTime % FIVE_WEIGHT;
		for (int i=0; i < 4; i++) {
			if (partTime > 0) {
				buffer.append(color);
				partTime--;
			} else {
				buffer.append(IDLE_LAMP);
			}
		}
		return buffer.toString();
	}
}
