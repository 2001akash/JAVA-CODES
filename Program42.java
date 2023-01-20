class Program41 {
    public static void main(String[] args) {
        point p1 = new point(4, 5);
        p1.setX(3);
    }
}

class point {
    private int x;
    private int y;

    public point() {
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
