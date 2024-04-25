
public class deletezeroes {
    public static void main(String[] args) {
        String a = "000012345";
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '0') {
                continue;
            } else {
                b=a.substring(i);
                break;
            }
        }
        System.out.println(b);
    }
}
