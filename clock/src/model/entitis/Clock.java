package model.entitis;

public class Clock {
  private int hour;
  private int minute;
  private int second;

  public Clock(){};
  
  public Clock(int hour, int minute, int second){
    this.setHour(hour);
    this.setMinute(minute);
    this.setSecond(second);
  }

  public int getHour(){
    return this.hour;
  }

  public void setHour(int hour){
    if (hour > 0 && hour < 24){
      this.hour = hour;
    } 

  }

  public int getMinute(){
    return this.minute;
  }

  public void setMinute(int minute){
    if (minute > 0 && minute < 59){
      this.minute = minute;
    }
  }

  public int getSecond(){
    return this.second;
  }

  public void setSecond(int second){
    if (second > 0 && second < 59){
      this.second = second;
    }
  }

  public void nextSecond(){
    if(second < 59){
      this.second +=1;
    } else {
      this.second = 0;
    }
  }

  public void nextMinute(){
    if (minute < 59){
      this.minute +=1;
    } else {
      this.second = 0;
    }
  }

  public void nextHour(){
    if (hour < 23){
      this.hour += 1;
    } else {
      this.hour = 
    }
  }

  public String setClock(int hour, int minute, int second){
    return getHour() + ":" + getMinute() + ":" + getSecond(); 
  }


}
