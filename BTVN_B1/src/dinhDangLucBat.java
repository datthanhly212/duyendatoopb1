public class dinhDangLucBat {
    public static void main(String[] args) {
        long start= System.nanoTime();
        String s= "công cha như núi thái sơn\n" +
                "nghĩa mẹ như nước trong nguồn chảy ra\n" +
                "một lòng thờ mẹ kính cha\n" +
                "cho tròn chữ hiếu mới là đạo con";
        //tách chuỗi
        String[] str = s.split("\n");

        //tìm length max
        int max = 0;
        for (String line : str) {
            if (line.length() > max) {
                max = line.length();
            }
        }
        for (String line : str) {

            String can = canGiua(line, max);

            System.out.println(can);

        }

        long end = System.nanoTime();
        long thG= end - start;
        System.out.println("Thời gian thực thi: " + thG + "ns");

    }

    public static String canGiua(String line, int max) {
        int kc = max - line.length();
        int left = kc / 2;
        int right = kc - left;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < left; i++) {
            sb.append(" ");
        }
        sb.append(Character.toUpperCase(line.charAt(0)));
        sb.append(line.substring(1));
        for (int i = 0; i < right; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }


}

