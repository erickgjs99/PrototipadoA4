package sample;



public class Main {
    public static void main(String[] args) {
        int[] values = new  int[1000];
        int min;

        for (int i = 0; i < 1000; i++){
            values[i] = (int) Math.random()*100;
        }
        System.out.println(values);



        for(int i = 0; i < 1000; i++){
            int index = -1;
            for(int j = 0; j < values.length; j++){
                if (values[j] == 80){
                    index = j;
                }
                break;}}}
}
