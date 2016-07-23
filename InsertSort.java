public class InsertSort {
    public static void main(String []args){
        int [] array={20, 25, 15, 42, 36, 16, 12};
        InsertSort.outPut(InsertSort.insertSort(array));

    }

    public static int [] insertSort(int [] array){
        for(int i=1; i<array.length;++i){
            int temp=array[i];
            // 保存下标
            int j=i;
            while (j>0&&temp<array[j-1]){
                // 上面数覆盖下面数
                array[j]=array[j-1];
                j--;
            }
            array[j]=temp;
        }
        return array;
    }

    public static void outPut(int [] array){
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }
}
