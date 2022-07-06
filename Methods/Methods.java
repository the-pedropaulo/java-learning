package Methods;

public class Methods {
    
    public static void main(String[] args) {
        msg("anything here!");
        System.out.println(soma(1,2));
        System.out.println(somaN(1,2,3,4,5));
    }

    public static void msg(String msgm) {
        System.out.println(msgm);
    }

    public static int soma(int n1, int n2) {
        int res = n1+n2;
        return res;
    }

    public static int somaN(int... numbers) {
        int res = 0;
        for(int n:numbers) {
            res+=n;
        }

        return res;
    }

    public static Double somaN(Double... numbers) {
        Double res = 0.0;
        for(Double n:numbers) {
            res+=n;
        }

        return res;
    }
}


