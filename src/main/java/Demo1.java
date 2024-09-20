public class Demo1 {
    public static void main(String[] args) {
        System.out.println("git practice begins here");
        String str = "java is a programming language";
        for (String word : str.split(" ")) {
            System.out.println(word + " -f this word is: " + word.length());
        }
    }
}
