package CHUONG5_DA_HINH.BAI3;

import java.util.ArrayList;
import java.util.List;

public class MainInterface {
    public static void main(String[] args) {

        List<Playable> instruments = new ArrayList<>();

        instruments.add(new Guitar(6));
        instruments.add(new Piano(88));
        instruments.add(new Violin(74.5));
        instruments.add(new Guitar(12));

        System.out.println("----- BUỔI HÒA NHẠC BẮT ĐẦU -----");

        for (Playable instrument : instruments) {
            instrument.play();
        }

        System.out.println("----- KẾT THÚC BUỔI HÒA NHẠC -----");
    }
}
