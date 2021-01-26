public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Rafi";
        stringArray[1] = "Nur";
        stringArray[2] = "Oktafian";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budy";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "rafi", "nur", "oktafian"
        };

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        String[][] members = {
                {"Rafi", "Nur"},
                {"Budi", "Nugraha"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }
}
