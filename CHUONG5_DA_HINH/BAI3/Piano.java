package CHUONG5_DA_HINH.BAI3;

public class Piano implements Playable {
    public int keys;

    public Piano(int keys) {
        this.keys = keys;
    }

    @Override
    public void play() {
        System.out.println("🎹 Đàn Piano (" + keys + " phím) đang được nhấn...");
    }
}