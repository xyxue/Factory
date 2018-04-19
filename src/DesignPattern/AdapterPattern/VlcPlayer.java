package DesignPattern.AdapterPattern;

/**
 * Created by wy_xue on 2017/12/12.
 */
public class VlcPlayer implements  AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
