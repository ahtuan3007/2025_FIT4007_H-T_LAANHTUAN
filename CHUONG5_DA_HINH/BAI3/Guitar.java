package CHUONG5_DA_HINH.BAI3;

public class Guitar implements Playable {
    public int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("🎸 Đàn Guitar (" + strings + " dây) đang được gảy...");
    }
}
