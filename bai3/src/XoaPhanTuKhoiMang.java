import java.util.ArrayList;
import java.util.List;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(4);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(6);
        l.add(0);
        l.add(0);
        l.add(0);
        l.add(0);
        l.remove(3);
        System.out.println(l);
    }
}
