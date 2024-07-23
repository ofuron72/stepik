package Lambda;

public class task5 {
    public static void main(String[] args) {
        FindDiscrim findDiscrim = (a,b,c)->{
            return b*b-4*a*c;
        };
        System.out.println(findDiscrim.discrim(1,-4,2));
        FindDiscrim result = (a,b,c)->{
            return a*b^c;
        };
        System.out.println(result.discrim(1,2,3));
    }
}
