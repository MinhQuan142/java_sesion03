import java.util.Scanner;
public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = array.length;
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Xóa phần tử
        System.out.println("nhập phần tử cần xóa: ");
        int x = sc.nextInt();
        //tìm phần  tử cần xóa
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
               array[i] = array[i + 1];
            }
            n--; // giảm thích thước của n đi 1
        }else {
            System.out.println("phần tử không tồn tại trong mảng");
        }
        //hiển thị lại mảng mới
        System.out.println("mới mới sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
