public class prac1 {
        public static void main(String[] args){
            String name = "danil";
            int nameLen = name.length();
            int innerlen = nameLen + 2;

            System.out.print("+");
            for (int i = 0; i < innerlen; ++i){
                System.out.print("-");
            }
                System.out.println("+");

                System.out.print("| ");
                System.out.print(name);
                System.out.println(" |");

                System.out.print("+");
                for(int i = 0; i < innerlen; ++i){
                    System.out.print("-");
                }
                System.out.println("+");
            
        }
}
