package basic.applebox;

public class AppleBox {    //完了
    private String boxname;
    private int size;
    private int count;

    public AppleBox(int initalsize, String bname) {    //完了
        this.size = initalsize;
        this.count = 0;
        this.boxname = bname;
    }

    public void setSize(int s) {
        int bsize = this.size;
        if(count <= s) {
            this.size = s;
        }
        else {
            this.size = count;
        }

        if(this.size > bsize) {
            System.out.println("{boxname} became larger!");
        } else if(this.size < bsize) {
            System.out.println("{boxname} became smaller!");
        } else { 
            System.out.println("{boxname} is not changed");
        }


       
    }

    public int getSize() {      //完了
        return this.size;
    }   

    public int getCount() {     //完了
        return this.count;
    }

    public void pull() {
        if(count >= 1) {
            count--;
            System.out.println("Here's an apple!");
        }
        else {
            System.out.println("No more apples…");
        }
    }

    public void put() {
        if(count >= size) {
            System.out.println("Full of apples!");
        } else {
            count++;
            System.out.println("Thanks!");
        }
    }

}