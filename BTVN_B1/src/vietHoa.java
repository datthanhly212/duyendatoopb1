import java.util.Scanner;

public class vietHoa {
    public static void main(String[] args) {
        long start = System.nanoTime();
        String name = "nguyễn thị mỹ duyên";
        String str = vietHoa(name);
        System.out.println(str);
        long end = System.nanoTime();
        long thG = end - start;
        System.out.println("Thời gian thực thi: " +thG + " ns");
    }
    public static String vietHoa(String name){
        StringBuilder sb = new StringBuilder();
        boolean str = true;

        for( char c : name.toCharArray()){
            if( Character.isWhitespace(c)){
                str = true;
            }else if(str){
                c = Character.toUpperCase(c);
                str = false;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}