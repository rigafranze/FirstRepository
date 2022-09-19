package erdpresserl190180.htlgkr.Hausuebung_PrimeSieve;

public class EratosthenesPrimeSieve implements PrimeSieve{
    int obergrenze;

    public EratosthenesPrimeSieve(int i) {
        obergrenze = i;
    }

    @Override
    public boolean isPrime(int p) {
        if(p<2){
            return false;
        }
        return true;
    }

    @Override
    public void printPrimes() {

    }
}
