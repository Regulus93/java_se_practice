package astron.main;
import java.awt.Point;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class BusinessmanSleepBreakOptimizer {
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int max = s.solution();
		System.out.println("Maximum break: " + max + " minute");
	}
}

class Solution {
	    
    public static final String S1 = "Mon 01:00-23:00\nTue 01:00-23:00\nWed 01:00-23:00\nThu 01:00-23:00\nFri 01:00-23:00\nSat 01:00-23:00\nSun 01:00-21:00";
    public static final String S2 = "Sun 10:00-20:00\nFri 05:00-10:00\nFri 16:30-23:50\nSat 10:00-24:00\nSun 01:00-04:00\nSat 02:00-06:00\nTue 03:30-18:15\nTue 19:00-20:00\nWed 04:25-15:14\nWed 15:14-22:40\nThu 00:00-23:59\nMon 05:00-13:00\nMon 15:00-21:00";

 public int solution() {
	 List<Point> meetings = processInput(S2);

     Collections.sort(meetings,new Comparator<Point>() {

		@Override
		public int compare(Point o1, Point o2) {
			return Integer.compare((int)o1.getX(),(int)o2.getX());
		}
	});
	 
     List<Integer> sleepingBreaks = calculateSleepingBreaks(meetings);
     int max = Collections.max(sleepingBreaks);

     return max;
 }
 
 private List<Integer> calculateSleepingBreaks(List<Point> meetings) {
	 List<Integer> sleepingBreaks = new ArrayList<>();
	 
     for(int i = 0; i < meetings.size(); i++) {
    	 if(i == 0) {
    		 sleepingBreaks.add(calculateBreakBetweenMeetings(new Point(0,0), meetings.get(i)));
    	 } else if (i == meetings.size()-1) {
    		 sleepingBreaks.add(calculateBreakBetweenMeetings(meetings.get(i), new Point(7*(24*60),0)));
    	 } else {
    		 sleepingBreaks.add(calculateBreakBetweenMeetings(meetings.get(i-1), meetings.get(i)));
    	 }
     }
     
	 return sleepingBreaks;
 }
 

 public int calculateBreakBetweenMeetings(Point p1, Point p2) {
	 return (p2.x - p1.y);
 }
 
 private List<Point> processInput(String s){
     String[] lines = s.split("\n");
     List<Point> meetings = processLines(lines);
     return meetings;
 }
 
 private List<Point> processLines(String[] lines) {
	 List<Point> meetings = new ArrayList<>();
     String day;
     int startTime = -1;
     int endTime = -1;
     for(String l : lines) {
         day = l.substring(0,3);
         startTime = calculateMinuteFromDate(day, l.substring(4,9));
         endTime = calculateMinuteFromDate(day, l.substring(10,15));
         meetings.add(new Point(startTime,endTime));
     }
     return meetings;
 }
 
 private int calculateMinuteFromDate(String day, String s){
     String[] splittedTime = s.split(":");
     int dayNumber = getDayNumber(day);
     int hour = Integer.parseInt(splittedTime[0]);
     int minute = Integer.parseInt(splittedTime[1]);
     return (dayNumber*24*60)+(hour*60)+minute;
 }
 
 private int getDayNumber(String day) {
	 int dayNumber = -1;
     switch(day) {
  	case "Mon":
  		dayNumber = 0;
  		break;
  	case "Tue":
  		dayNumber = 1;
  		break;
  	case "Wed":
  		dayNumber = 2;
  		break;
  	case "Thu":
  		dayNumber = 3;
  		break;
  	case "Fri":
  		dayNumber = 4;
  		break;
  	case "Sat":
  		dayNumber = 5;
  		break;
  	case "Sun":
  		dayNumber = 6;
  		break;
  	default:
  		break;
  }
		return dayNumber;
 }
}