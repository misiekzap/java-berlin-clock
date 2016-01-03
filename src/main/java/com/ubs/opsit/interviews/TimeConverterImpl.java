package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

	private PartTimeFactory partialTimeFactory = new PartTimeFactory();
	
	
	@Override
	public String convertTime(String aTime)  {
		validateCorrectInputTime(aTime);
		
		//LocalTime datetime = LocalTime.parse(aTime, DateTimeFormatter.ISO_LOCAL_TIME);
		String[] splitted = aTime.split(":");
		int hour = Integer.parseInt(splitted[0]);
		int minute = Integer.parseInt(splitted[1]);
		int second = Integer.parseInt(splitted[2]);
		
		
		return buildBerlinClockPartially(hour, minute, second);
	}

	private String buildBerlinClockPartially(int hour, int minute, int second) {
		StringBuffer result = new StringBuffer();
		
		result.append(partialTimeFactory.createEvenSecondPartConverter().convertPartTime(second));
		result.append(partialTimeFactory.createFiveHourPartConverter().convertPartTime(hour));
		result.append(partialTimeFactory.createSingleHourPartConverter().convertPartTime(hour));
		result.append(partialTimeFactory.createFiveMinutePartConverter().convertPartTime(minute));
		result.append(partialTimeFactory.createSingleMinutePartConverter().convertPartTime(minute));
		
		return result.toString();
	}

	private void validateCorrectInputTime(String aTime) {
		if (!aTime.matches("^[0-2][0-9](:[0-6][0-9]){2}$")) {
			throw new WrongInputTimeException(aTime);
		};
	}
	
}
