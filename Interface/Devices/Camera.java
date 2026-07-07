package Interface.Devices;

// Interface can achieve multiple inheritance

public interface Camera {
    void takePhoto();

    void recordVideo();

}

 interface MusicPlayer {
    void playMusicPlay();
    void stopMusic();



}

interface Phone{
    void makeCall(int number);
    void endCall();

}
 class SmartPhone implements Camera,MusicPlayer, Phone{

     @Override
     public void takePhoto() {
         System.out.println("Taking photo with smartphone");

     }

     @Override
     public void recordVideo() {
         System.out.println("recording video with smartphone");

     }

     @Override
     public void playMusicPlay() {
         System.out.println("Playing music on smart Phone");

     }

     @Override
     public void stopMusic() {
         System.out.println("Stoping music on smart Phone");

     }



     @Override
     public void makeCall(int number) {
         System.out.println("Calling " + number +" from smartphone");

     }

     @Override
     public void endCall() {
         System.out.println("Ending call on smartphone");

     }
 }

class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall(100200554);
        smartPhone.endCall();
        smartPhone.playMusicPlay();
        smartPhone.stopMusic();
        smartPhone.takePhoto();
        smartPhone.recordVideo();



    }

}


