class Program41 {
    public static void main(String[] args) {
        ColourChecking rgb = new ColourChecking(193, 255, 183);
        rgb.rgb_to_hsv();
    }
}

class ColourChecking {
    double r, g, b;

    ColourChecking(int red, int green, int blue) {
        r = red;
        g = green;
        b = blue;
    }

    public void rgb_to_hsv() {
        r = r / 255.0;
        g = g / 255.0;
        b = b / 255.0;
        double cmax = Math.max(r, Math.max(g, b));
        double cmin = Math.min(r, Math.min(g, b));
        double diff = cmax - cmin;
        double h = -1, s = -1;
        if (cmax == cmin)
            h = 0;
        else if (cmax == r)
            h = (60 * ((g - b) / diff) + 360) % 360;
        else if (cmax == g)
            h = (60 * ((b - r) / diff) + 120) % 360;
        else if (cmax == b)
            h = (60 * ((r - g) / diff) + 240) % 360;
        if (cmax == 0)
            s = 0;
        else
            s = (diff / cmax) * 100;
        double v = cmax * 100;
        System.out.println("(" + h + " " + s + " " + v + ")");
    }

}
