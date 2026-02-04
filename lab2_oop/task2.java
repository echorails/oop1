public class task2{
    public static void main(String[] args){
        StarTriangle small = new StarTriangle(3);
        System.out.print(small.toString());
    }
}

class StarTriangle{
    int width;

    StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        String result = "";

        for (int row = 1; row <= width; row++) {
            for (int i = 1; i <= row; i++) {
                result = result + "[*]";
            }
            result = result + "\n";
        }

    return result;
    }
}