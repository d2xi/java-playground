package strategy;

import context.Codec;

public class Flac implements Codec{

    @Override
    public void play(String filename) {
        if (filename.endsWith(".mp3")) {
            System.out.println("Playing ... Bu bu bu bu ...");
        } else {
            System.out.println("The file is not a FLAC audio file.");
        }
    }

    @Override
    public String toString() {
        return "Flac Codec";
    }
    
}
