package context;

public class MusicPlayer {

    private Codec codec;

    public void setCodec(Codec codec){
        this.codec = codec;
        System.out.println("Codec installed: " + codec);
    }


    public void play(String fileName){
        System.out.println("Opening file " + fileName + " ...");
        codec.play(fileName);
    }

}