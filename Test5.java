public class Test5 {
    public static void main(String[] args) {
        int count = 1;

        for(int i = 1; i <= 5; i++){
            int curCount = count;
            while(curCount<count + i){
                System.out.print(curCount + " ");
                curCount++;
            }
            count = count + i;
            System.out.println();
        }
    }
}
