import java.math.BigInteger;

public class PlusOne {

  public static int[] plusOne(int[] digits) {
    if (digits[digits.length - 1] != 9) {
      digits[digits.length - 1] = digits[digits.length - 1] + 1;
      for (int i = 0; i < digits.length; i++) {
        System.out.println(digits[i]);
      }
      return digits;
    } else {
      int[] arr = new int[digits.length + 1];

       BigInteger temp = BigInteger.ZERO;

        for (int i = 0; i < digits.length; i++) {
            temp = temp.multiply(BigInteger.TEN);
            temp = temp.add(BigInteger.valueOf(digits[i]));
        }

      int count = 0;
      BigInteger copy = temp;
     
      while (copy.compareTo(BigInteger.ZERO) > 0) {
        if (copy.mod(BigInteger.TEN).equals(BigInteger.valueOf(9))) {
            count++;
        }
        copy = copy.divide(BigInteger.TEN);
    }
      temp = temp.add(BigInteger.ONE);

      for (int i = 0; i < arr.length; i++) {
        arr[arr.length - 1 - i] = temp.mod(BigInteger.TEN).intValue();
        temp = temp.divide(BigInteger.TEN);
    }
      
      if (count != arr.length - 1) {
          int[] t = new int[arr.length - 1];
          for (int index = 0; index < t.length; index++) {
              t[index] = arr[index + 1];
            }
            arr = t;
        }
      return arr;
    }
  } 

  public static void main(String[] args) {
    int[] arr = {5,2,2,6,5,7,1,9,0,3,8,6,8,6,5,2,1,8,7,9,8,3,8,4,7,2,5,8,9};
    plusOne(arr);
  }
}