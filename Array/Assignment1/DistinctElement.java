public class DistinctElement {
    public static boolean checkRepetition(int num[]){
        for(int i = 0 ; i < num.length - 1; i++){
            for(int j = i+1 ; j < num.length ; j++){
                if (num[i] == num[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,1};
        System.out.println(checkRepetition(num));
    }
}
