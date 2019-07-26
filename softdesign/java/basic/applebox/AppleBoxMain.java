package basic.applebox;

public class AppleBoxMain {
    public static void main(String[] args) {
        AppleBox ab = new AppleBox(3,"ab");
        System.out.println("this.size of ab is"+ab.getSize());
        ab.pull();
        ab.put();
        ab.pull();
        ab.put();
        ab.pull();
        ab.put();
        ab.pull();
        ab.put();

        ab.setSize(s);

        ab.put();
        ab.pull();
        ab.put();

    }
}