package operacions;
public class Factorial {

    public double getRecursiva(int n){
        if(n < 0){
            throw  new IllegalArgumentException();
        }
        if(n == 1 || n == 0){
            return 1;
        }
        Factorial fmenos1 = new Factorial();
        return n * fmenos1.getRecursiva(n - 1);
    }

    public double getIterativa(int n){
        if(n < 0){
            throw  new IllegalArgumentException();
        }
        if(n == 1 || n == 0){
            return 1;
        }

        int aux = 1;
        for (int i = 2; i <= n; i++){
            aux *= i;
        }
        return aux;
    }
}
