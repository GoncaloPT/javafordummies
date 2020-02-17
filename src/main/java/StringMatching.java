public class StringMatching {
    public static void main(String[] args) {
        String[] testStrings = {"Hello", "Hi", "Hola", "Howdy"};
        if (isStringInArray(testStrings, "Hola")) {
            System.out.println("There is Hola in testStrings");
        }
        if (isStringInArray(testStrings, "Hey")) {
            System.out.println("There is not Hey in testStrings");
        } else {
            System.out.println("There is no word in testStrings");
        }
    }

    public static boolean isStringInArray(String[] strings, String potencialMatch) {

        for (int i=0;i<strings.length;i++){
            if(potencialMatch.equals(strings[i])){
                return true;
            }
        }
        return false;
    }
}
