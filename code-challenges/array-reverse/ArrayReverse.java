//help walking through this problem (and understanding the problem itself) came from https://www.softwaretestinghelp.com/reverse-an-array-in-java

public class ArrayReverse {

  public static void main(String[] args) {
    Integer[] intArray = {1,2,3,4,5,6,7,8,9};

    System.out.println("Orig array:");
    for(int i=0; i<intArray.length;i++)
      System.out.print(intArray[i] + " ");

    System.out.println();

    System.out.println("Orig array in reverse order:");
      for(int i=intArray.length-1; i>=0; i--)
      System.out.print(intArray[i] + " ");
  }
}