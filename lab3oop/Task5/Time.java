package Task5;

public class Time implements Comparable<Time> {
    int h;
    int m;
    int s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int compareTo(Time t) {
        if (this.h != t.h) return this.h - t.h;
        if (this.m != t.m) return this.m - t.m;
        return this.s - t.s;
    }

    public String toString() {
        return h + ":" + m + ":" + s;
    }
}
