import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newArr = new int[array.length + 1];// tạo một mảng mới có kích thước lớn hơn

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can chen");
        int N = scanner.nextInt();
        System.out.println("Nhap vi tri can chen");
        int index = scanner.nextInt();
        System.arraycopy(array, 0, newArr, 0, index);// sao chép các phần tử từ mảng cũ vào mảng mới
        newArr[index] = N;// gán giá trị phần tử mới vào vị trí mong muốn
        System.arraycopy(array, index, newArr, index + 1, array.length - index); // sao chép các phần tử còn lại từ mảng cũ vào mảng mới
        System.out.println("Mảng cũ: " + Arrays.toString(array));
        System.out.println("Mảng mới: " + Arrays.toString(newArr));
    }
}
