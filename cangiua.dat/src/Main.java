import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đoạn văn bản (nhấn liên tục hai lần Enter hoặc Ctrl + D để kết thúc):");
        StringBuilder sb = new StringBuilder();
        String dong;
        while (sc.hasNextLine()) {
            dong = sc.nextLine();
            if (dong.isEmpty()) {
                break;
            }
            sb.append(dong).append("\n");
        }

        String[] lines = sb.toString().split("\n");
        int max = 0;
        for (String currentLine : lines) {
            max = Math.max(max, currentLine.length());
        }

        for (String donghientai : lines) {
            String centeredLine = cangiua(donghientai, max);
            System.out.println(centeredLine);
        }
    }

    private static String cangiua(String dong, int toida) {
        int khoangtrangcanthem = toida - dong.length();
        int khoangtrangbentrai = khoangtrangcanthem / 2;
        int khoangtrangbenphai = khoangtrangcanthem - khoangtrangbentrai;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < khoangtrangbentrai; i++) {
            sb.append(" ");
        }

        sb.append(Character.toUpperCase(dong.charAt(0))).append(dong.substring(1));

        for (int i = 0; i < khoangtrangbenphai; i++) {
            sb.append(" ");
        }

        return sb.toString();
    }
}
