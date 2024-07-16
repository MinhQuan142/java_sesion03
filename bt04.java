import java.util.Scanner;
import java.util.Arrays;

public class bt04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của mảng: ");
        int rows = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int cols = sc.nextInt();

        // Nhập các giá trị cho mảng mới tạo
        double[][] array = new double[rows][cols];
        arrayPlus(array, sc);

        // Tìm phần tử lớn nhất của mảng 2 chiều
        double arrMax = array[0][0]; // Giả sử phần tử đầu tiên là lớn nhất
        int rowMax = 0, colMax = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] > arrMax) {
                    arrMax = array[i][j];
                    rowMax = i;
                    colMax = j;
                }
            }
        }

        // In mảng 2 chiều gốc
        System.out.println("Mảng 2 chiều bạn vừa tạo ra là:");
        inMaTran(array); // Gọi hàm inMaTran để in mảng 2 chiều

        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là: " + arrMax);
        System.out.println("Tọa độ của phần tử lớn nhất là: [" + rowMax + ", " + colMax + "]");

        sc.close();
    }

    // Hàm nhập giá trị cho các phần tử của mảng
    public static void arrayPlus(double[][] array, Scanner sc) {
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Phần tử tại vị trí [" + i + ", " + j + "]: ");
                array[i][j] = sc.nextDouble(); // Gán giá trị nhập vào cho phần tử mảng
            }
        }
    }

    // Hàm in ma trận ra màn hình
    public static void inMaTran(double[][] maTran) {
        for (double[] hang : maTran) {
            System.out.println(Arrays.toString(hang));
        }
    }
}
