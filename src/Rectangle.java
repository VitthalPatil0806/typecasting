public class Rectangle extends Shape{
    private int h;
    private int w;

    public Rectangle(int x, int y, int h, int w){
        super(x, y);
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(w+" "+h+" "+"width and height");
    }
}
