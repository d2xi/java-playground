import context.MusicPlayer;
import strategy.Flac;
import strategy.Mp3;

public class Main {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        String audioFile1 = "bububu.flac";
        String audioFile2 = "lalala.mp3";
        mp.setCodec(new Mp3());
        mp.play(audioFile1);
        mp.play(audioFile2);
        mp.setCodec(new Flac());
        mp.play(audioFile1);
    }
}
