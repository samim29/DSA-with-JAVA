

public class CountSort {
    public static void sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
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
