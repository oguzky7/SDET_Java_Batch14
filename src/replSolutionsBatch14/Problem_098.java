package replSolutionsBatch14;

/*
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
Expected Output:
Welcome Syntax family
 */
public class Problem_098 {
    public static void main(String[] args) {

        String given = "Hello Syntax friends";

        given = given.replace("Hello", "Welcome");
        given = given.replace("friends", "family");
        System.out.println(given);
    }
}
