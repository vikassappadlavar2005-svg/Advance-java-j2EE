package Collections;

public class performtestjava {
    public static void main(String[] args) {

        int n = 10000;

        // ================= StringBuffer =================
        StringBuffer sbf = new StringBuffer();
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sbf.append("AIET");
        }

        long end1 = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end1 - start1) + " ms");

        // ================= StringBuilder =================
        StringBuilder sbd = new StringBuilder();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            sbd.append("AIET");
        }

        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end2 - start2) + " ms");
    }
}