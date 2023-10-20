public class Magic8Ball {
    public void output(int nummer) {
        try {
            if (nummer == 1) {
                System.out.println("Ja gaat zeker lukken");
            }
            if (nummer == 2) {
                System.out.println("Misschien");
            }
            if (nummer == 3) {
                System.out.println("Zou zo maar kunnen");
            }
            if (nummer == 4) {
                System.out.println("Absoluut niet");
            }
            if (nummer == 5) {
                System.out.println("Alleen als je je er echt voor gaat");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void print(String output) {
        System.out.println(output);
    }

    public String output2(int nummer) {
        try {
            if (nummer == 1) {
                return "Ja gaat zeker lukken";
            }
            if (nummer == 2) {
                return "Misschien";
            }
            if (nummer == 3) {
                return "Zou zo maar kunnen";
            }
            if (nummer == 4) {
                return "Absoluut niet";
            }
            if (nummer == 5) {
                return "Alleen als je je er echt voor gaat";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    return null;
    }
}
