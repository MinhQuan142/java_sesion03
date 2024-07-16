import java.util.Scanner;
 class bt02 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         int n = arr.length;
         System.out.println("Mảng ban đầu là: ");
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
         System.out.println("Nhập phần tử cần chèn vào mảng: ");
         int x = sc.nextInt();
         System.out.println("Nhập vị trí cần chèn từ 0 đến " + n);
       int index = sc.nextInt();
       if (index < 0 || index >= n) {
           System.out.println("Vui lòng nhập giá trị họe lệ từ 0 đến " + n);
       }else {
           int[] newArr = new int[n + 1];
           for (int i = 0; i < index; i++) {
               newArr[i] = arr[i];
           }
           newArr[index] = x;
           for (int i = index; i < n; i++) {
               newArr[i + 1] = arr[i];
           }
           System.out.println("mang moi sau khi chen: ");
           for (int i = 0; i < newArr.length; i++) {
               System.out.print(newArr[i] + " ");
           }
           System.out.println();
       }
     }
}
