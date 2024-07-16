import java.util.Scanner;
import java.util.Arrays;
public class bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //tạo mảng số 1
        System.out.println("Nhập số phần tử trong mảng 1: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];
        arrPlus(array1, sc, "mảng 1");

        //tạo mảng số 2
        System.out.println("mời nhập số phần tử trong mảng số 2");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];
        arrPlus(array2, sc, "mảng 2");

        //tao mang 3 để chứa 2 mảng 1 và 2
        int[] array3 = new int[n1 + n2];
        //chép lại mảng n1 sang n3
        for (int i = 0; i < n1; i++) {
            array3[i] = array1[i];
        }
        //sao chép mảng 2 vào mảng 3
        for (int i = 0; i < n2; i++) {
            array3[n1 + i] = array2[i];
        }
        System.out.println("Mảng của bạn sau khi gộp" + Arrays.toString(array3));
        sc.close();
    }
    // Hàm nhập giá trị cho mảng (giống như trước)
    public static void arrPlus(int[] mang, Scanner scanner, String tenMang) {
        System.out.println("Nhập các phần tử của " + tenMang + ":");
        for (int i = 0; i < mang.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
    }
}
