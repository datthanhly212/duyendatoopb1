import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        long begin = System.nanoTime();
        String str = "công cha như núi thái sơn\n" +
                "nghĩa mẹ như nước trong nguồn chảy ra\n" +
                "một lòng thờ mẹ kính cha\n" +
                "cho tròn chữ hiếu mới là đạo con";
        //tách chuỗi
        String[] strStr = str.split("\n");

        // tim max length
        int max = 0;
        for(String line : strStr){
            if(line.length() > max){
                max = line.length();
            }
        }
        for(String line : strStr){
            String kq = canLe(line,max);
            System.out.println(kq);
        }
        long end = System.nanoTime();
        long thG = end - begin;
        System.out.println("____________________________");
        System.out.println("Thời gian thực thi: "+ thG+ " ns");
    }
    public static String canLe(String line, int max){
        int kc = max - line.length();
        int left = kc /2;
        int right = kc - left ;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i< left ; i ++ ){
            sb.append(" ");
        }
        sb.append(Character.toUpperCase(line.charAt(0)));
        sb.append(line.substring(1));
        for(int i =0; i< right; i++){
            sb.append(" ");
        }
        return sb.toString();
    }

}