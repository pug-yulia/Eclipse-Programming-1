package viopeTasks5to8;

public class ClockTime {

	private int hours;
	private int minutes;
	
	public ClockTime() {
		this.hours = 0;
		this.minutes = 0;
	}
	
	public void add(int hours, int minutes) {
		if (hours < 0 || minutes < 0) {
			return;
		} else {
			this.hours += hours;
			this.minutes += minutes;
		}
		
		if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }

        if (this.hours >= 24) {
            this.hours %= 24;
        }
	}
	
	 public String toString() {
		 
		 String hourStr;
		 if (this.hours < 10) {
		     hourStr = "0" + this.hours;
		 } else {
		     hourStr = Integer.toString(this.hours);
		 }

		 String minuteStr;
		 if (this.minutes < 10) {
		     minuteStr = "0" + this.minutes;
		 } else {
		     minuteStr = Integer.toString(this.minutes);
		 }

		 return hourStr + ":" + minuteStr;

		 
	 }
}
