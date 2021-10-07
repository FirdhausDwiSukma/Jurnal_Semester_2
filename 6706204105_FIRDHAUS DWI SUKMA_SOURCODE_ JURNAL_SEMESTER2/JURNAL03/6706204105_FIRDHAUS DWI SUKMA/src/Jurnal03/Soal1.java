package Jurnal03;

public class Soal1 {
    public static void main(String[] args) {
        BackFoward<String> backForward = new BackFoward<String>();

        backForward.addData("https://www.google.com/search?q=comparable+java+integer");
        backForward.addData("https://www.javatpoint.com/java-integer-compareto-method");
        backForward.addData("https://www.javatpoint.com/java-integer-compareunsigned-method");

        backForward.back();
        backForward.forward();

    }
}