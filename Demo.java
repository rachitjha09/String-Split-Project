
/**
 * Spliting a String
 *
 * @author (Rachit Jha)
 * @version (1/18/24)
 */
public class Demo
{
    public static void main(String[]args){
        String rec="abbcdbbeebdbbcdgbhbbahha";
        String []tokens=rec.split("");
        for(String t:tokens){
            System.out.println(t);
        }
    }
}