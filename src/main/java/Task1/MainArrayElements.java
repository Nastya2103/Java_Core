package Task1;

import java.util.Arrays;

public class MainArrayElements {
    static Integer[]  arrayInteger = {5, 6, 7};

    public static void main(String[] args) {
        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
        try {
            System.out.println(Arrays.toString(swapArrayClass.swapElements (arrayInteger, 0, 2)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
