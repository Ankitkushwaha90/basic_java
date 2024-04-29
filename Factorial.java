// import java.io;
// import ankitt from ".//media/ankit/782a25c8-6d08-4866-853c-74987551f792/java/java/GFG.java";
class factorial{

    static int factorials(int n){
        int res = 1, i;
        for(i=2; i<n; i++)
            res*=n;
        return res;
    }
    public static void main(String[] args){
        System.out.print("hello world =>"+ factorials(5));
    }
}