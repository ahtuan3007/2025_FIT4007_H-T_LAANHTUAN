package CHUONG5_DA_HINH.BAI3;

public class Violin implements Playable {
    public double bowLength;

    public Violin(double bowLength) {
        this.bowLength = bowLength;
    }

    @Override
    public void play() {
        System.out.println("🎻 Đàn Violin (với vĩ dài " + bowLength + " cm) đang được kéo...");
    }
}
