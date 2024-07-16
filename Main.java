import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arr1 = {1, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Mảng ban đầu: " + Arrays.toString(arr1));

        do {
            //menu hiển thị lựa chọn
            System.out.println("Chọn chức năng");
            System.out.println("1. Thêm phần tử vào mảng");
            System.out.println("2. Xóa phần tử khỏi mảng");
            System.out.println("3. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    arr1 = arrPlus(sc, arr1); // Cập nhật arr1 sau khi thêm phần tử
                    break;
                case 2:
                    arr1 = arrRsRemove(sc, arr1); // Cập nhật arr1 sau khi xóa phần tử
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại");
            }
        } while (choice != 3); // Điều kiện thoát là choice != 3

        sc.close();
    }

    // Thêm phần tử vào mảng
    public static int[] arrPlus(Scanner sc, int[] arr) {
        System.out.println("Nhập một số nguyên bất kỳ để thêm vào mảng: ");
        int aPlus = sc.nextInt();

        int[] arrRs = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrRs[i] = arr[i];
        }

        arrRs[arrRs.length - 1] = aPlus; // Thêm phần tử mới vào cuối mảng arrRs

        System.out.println("Mảng arr1 sau khi thêm: " + Arrays.toString(arrRs));
        return arrRs; // Trả về mảng mới
    }

    // Xóa phần tử khỏi mảng
    public static int[] arrRsRemove(Scanner sc, int[] arr) {

        System.out.println("Nhập vị trí phần tử muốn xóa (0 đến " + (arr.length - 1) + "): ");
        int removeIndex = sc.nextInt();
        int[] arrRsRemove = new int[arr.length - 1]; // Tạo mảng mới có độ dài bằng arr - 1

        // Kiểm tra vị trí xóa có hợp lệ không
        if (removeIndex < 0 || removeIndex >= arr.length) {
            System.out.println("Vị trí xóa không hợp lệ");
            return arr; // Trả về mảng ban đầu nếu vị trí xóa không hợp lệ
        }

        // Copy các phần tử từ arr sang arrRsRemove, bỏ qua phần tử cần xóa
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != removeIndex) {
                arrRsRemove[j++] = arr[i];
            }
        }

        System.out.println("Mảng arr1 sau khi xóa phần tử ở vị trí " + removeIndex + ": " + Arrays.toString(arrRsRemove));
        return arrRsRemove; // Trả về mảng mới sau khi xóa
    }
}
