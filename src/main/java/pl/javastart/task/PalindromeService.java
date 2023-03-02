package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {

        if (array == null) {
            return false;
        }

        if (array.length == 0) {
            return false;
        }

        boolean result = true;
        int i = 0;

        while (result && (i < (array.length / 2))) {
            if (array[i] != array[array.length - 1 - i]) {
                result = false;
            } else {
                i++;
            }
        }

        return result;
    }
}
