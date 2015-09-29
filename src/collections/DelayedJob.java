package collections;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedJob implements Delayed {
	private final Instant scheduledTime;
	String jobName;
	
	public DelayedJob(String jobName, Instant scheduledTime) {
		this.scheduledTime = scheduledTime;
		this.jobName = jobName;
	}
	
	@Override
	public int compareTo(Delayed job) {
		long currentJobDelay = this.getDelay(TimeUnit.MILLISECONDS);
		long jobDelay = job.getDelay(TimeUnit.MILLISECONDS);
		
		int diff = 0;
		if (currentJobDelay > jobDelay) {
			diff = 1;
		} else if (currentJobDelay < jobDelay) {
			diff = -1;
		}
		return diff;
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long delay = ChronoUnit.MILLIS.between(Instant.now(), scheduledTime);
		
		long returnValue = unit.convert(delay, TimeUnit.MILLISECONDS);
		return returnValue;
	}
	
	@Override
	public String toString() {
		String str = "(" + this.jobName + ", " + "Scheduled Time: " + this.scheduledTime + ")";
		return str;
	}
}
