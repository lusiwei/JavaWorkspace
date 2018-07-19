/**
 * 数组排序
 */
package Thursday_7_19;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {3, 45, 12, 1, 22, 17, 30};
        int j, k = 7;
        boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
        while (flag){
            flag=false;//每次开始排序前，都设置flag为未排序过
            for(j=1; j<k; j++){
                if(arr[j-1] > arr[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;

                    //表示交换过数据;
                    flag = true;
                }
            }
            k--;//减小一次排序的尾边界
        }//end while
        for (int a : arr) {
            System.out.println(a);
        }
    }
}
