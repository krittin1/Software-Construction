public class Computer implements VolumeChangeable , NetworkInterface{



    private int volume;
    private  static final int MAX_VOLUME = 100;
    private  static final int MIN_VOLUME = 0;
    @Override
    public void increaseVolume() {
        volume = ++volume > MAX_VOLUME ? MAX_VOLUME : volume;

    }

    @Override
    public void decreaseVolume() {
        volume = --volume < MIN_VOLUME ? MIN_VOLUME : volume;
    }


    @Override
    public void connect(Network network) {
        System.out.println("connected network");
    }

    @Override
    public void disconnect(Network network) {
        System.out.println("disconnect network");
    }

    public int getVolume() {
        return volume;
    }
}
