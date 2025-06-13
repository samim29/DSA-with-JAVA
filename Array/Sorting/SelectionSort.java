

public class SelectionSort {
        public  static void sort(int num[]){
            for (int turn = 0 ; turn <= num.length-2; turn++){
                
                int idxMin = turn;
                for(int i = turn + 1; i<num.length;i++){
                        if(num[i]<num[idxMin]) {
                            
                           idxMin  = i;
                        }  
                }
                int temp = num[turn];
                    num[turn] = num [idxMin];
                    num[idxMin]=temp;
            }
        }
        public static void main(String[] args) {
        int num[] = {5,3,1,4,2};
        sort(num);
        for(int i =0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
