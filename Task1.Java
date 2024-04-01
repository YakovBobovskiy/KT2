public class Main {
    public static void main(String[] args) {
        String Haysteck = "sadbutsad";
        String Needle = "sad";
        int index = -1;
        for (int i = 0; i <= Haysteck.length()-Needle.length(); i++){
            if (Haysteck.charAt(i) == Needle.charAt(0)){
                if (Haysteck.substring(i, i+Needle.length()).equals(Needle)){
                    index = i;
                    System.out.println(index);
                    System.exit(0);
                }
            }
        }
        System.out.println(index);
    }
}
