public class SumOfNumbers {
    public String GetSum;

    public static void GetSum(int[] SumOfNumber) {
        for (int index = 0; index<SumOfNumber.length; index++) {
            System.out.println(new SumOfNumber().GetSum(a:1, b:0));//output 1
            System.out.println(new SumOfNumber().GetSum(a:1, b:2));//output 3
            System.out.println(new SumOfNumber().GetSum(a:0, b:1));//output 1
            System.out.println(new SumOfNumber().GetSum(a:1, b:1));//output 1
            System.out.println(new SumOfNumber().GetSum(a:-1, b:0));//output -1
            System.out.println(new SumOfNumber().GetSum(a:-1, b:2));//output -1
        }
    }

    public static void main(String[] args) {
        int[] Angka = {2, 3, 4};
        GetSum(Angka);
    }
}