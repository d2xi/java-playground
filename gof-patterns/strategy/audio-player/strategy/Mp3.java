package strategy;

import context.Codec;

public class Mp3 implements Codec{

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")) {
            System.out.println("Playing ... La la la la...");
        } else {
            System.out.println("The file is not a MP3 audio file.");
        }
    }

    @Override
    public String toString() {
        return "Mp3 Codec";
    }
    
}
