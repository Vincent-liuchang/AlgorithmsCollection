import java.math.BigInteger;

public class EuclidAlgorithm {
    public static int GCD(int a, int b) {

        if (b == 0)
            return a;
        else
            return GCD(b, a%b);
    }

    public static int[] ExtendedEuclid(int a, int b){
        int results[] = new int[3];
            //results[0] for x, results[1] for y while results[2] for GCD(a, b)
        if(b == (0)){
            results[0] = 1;
            results[1] = 0;
        }else{
            results[0] = ExtendedEuclid(b,a%b)[1];
            results[1] = ExtendedEuclid(b,a%b)[0]-a/b*ExtendedEuclid(b,a%b)[1];
        }
        results[2] = results[0]*a + results[1]*b;
        return results;
    }

    public static int InverseOfa(int a, int n){
        if (ExtendedEuclid(a,n)[2]*ExtendedEuclid(a,n)[2] != 1)
            return 0;
        // the inverse of a mod n don't exists
        else
            return ExtendedEuclid(a,n)[0];
    }

    public static int[] convert(String character){
        char a[] =  character.toCharArray();
        int b[] = new int[a.length];

        for(int i =0; i<a.length; i++){
            switch(a[i]){
                case ',':b[i] = 26;break;
                case '.':b[i] = 27;break;
                case '?':b[i] = 28;break;
                case '!':b[i] = 29;break;
                case ' ':b[i] = 30;break;
                default:b[i] = a[i]-'A';break;
            }
        }
        return b;
    }

    public static String convertback(int number[]){
        char b[] = new char[number.length];

        for(int i =0; i<number.length; i++){
            switch(number[i]){
                case 26:b[i] = ',';break;
                case 27:b[i] = '.';break;
                case 28:b[i] = '?';break;
                case 29:b[i] = '!';break;
                case 30:b[i] = ' ';break;
                default:b[i] = (char)(number[i]-0+'A');break;
            }
        }
        return String.copyValueOf(b);
    }
}


