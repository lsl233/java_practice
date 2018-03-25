public class YangHuiTrangle {
    public static void main(String[] args) {
        int levelCount = 10;
        int[][] yangHui = new int[levelCount][0];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    yangHui[i][j] = 1;
                }
                if (i == 1) {
                    yangHui[i][j] = 1;
                }

                yangHui[i][j] = yangHui;
            }
        }
        System.out.println(yangHui);
    }
}
