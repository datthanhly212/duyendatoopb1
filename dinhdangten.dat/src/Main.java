import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tên viết thường: ");
        String tenhodaydu = sc.nextLine();
        String[] kho1 = tenhodaydu.split(" ");
        String dingdanglaiten = "";
        for (String kho3 : kho1) {
            String chucaidautien = kho3.substring(0, 1).toUpperCase();
            String kho2 = kho3.substring(1).toLowerCase();
            dingdanglaiten += chucaidautien + kho2 + " ";
        }
        System.out.print("Úm ba la: " + dingdanglaiten);
    }
}
