public class YangHuiTrangle {
    public static void main(String[] args) {
        int levelCount = 10;
        int[][] yangHui = new int[levelCount][0];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            String blanks = "";
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == yangHui[i].length - 1) {
                    yangHui[i][j] = 1;
                } else {
                    yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
                }
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println(blanks);
        }
//        System.out.println(yangHui);
    }
}
