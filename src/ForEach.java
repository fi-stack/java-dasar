public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Rafi", "Nur", "Oktafian",
                "Programmer", "Zaman", "Now"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for (var value : names) {
            System.out.println(value);
        }

    }
}
