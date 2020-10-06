public class TV{

public TV(){
}

int channel;{
channel = 1; //default
}
int volumeLevel;{
volumeLevel = 1; //default
}
boolean on;{
}//initializes as false, default

public void turnOn(){
on = true;
}
public void turnOff(){
on = false;
}
public void setChannel(int newChannel){
if (on && newChannel >= 1 && newChannel <= 120)
channel = newChannel;
}

public void setVolumeLevel(int newVolumeLevel){
if (on && newVolumeLevel >=1 && newVolumeLevel <= 7)
volumeLevel = newVolumeLevel;
}//set new volume

public void channelUp(){
if(on && channel < 120)
channel++;}//increase channel by 1

public void channelDown(){
if(on && channel > 1)
channel--;}//decrease channel by 1

public void volumeUp(){
if (on && volumeLevel < 7)
volumeLevel++;
}//increase volume by 1

public void volumeDown(){
if (on && volumeLevel > 1)
volumeLevel--;
}//decrease volume by 1



/*

constructor at the beginning or end?
one object per class, multiple classes in one file. one public class per file
IE time down from 2 hours to 1?  

*****IE1 look back at the practice excercises from lecture week of september 17th
*/

}//end of class

