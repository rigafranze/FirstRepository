package erdpresserl190180.htlgkr.Hausuebung_PrimeSieve;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int count;
    private boolean[] numbers;
    public EratosthenesPrimeSieve(int i) {
        count = i;
        numbers = new boolean[count + 1];
        numbers[0] = true;
        numbers[1] = true;
    }

    @Override
    public boolean isPrime(int p) {

        //Durchlauf so lang, wie groß die Obergrenze ist (count bzw. numbers) - 0, 1 wurden geskipped (wegen Komplikationen - 0/0)
        for (int currentNumber = 2; currentNumber < numbers.length; currentNumber++) {
            //current<Number + 1, weil die eigene Zahl nicht kontrolliert werden muss. (bsp. ob 2 ein vielfaches von 2 ist)
            for (int numberToCheck = currentNumber + 1; numberToCheck < numbers.length; numberToCheck++) {
                //ist "number" ein Vielfaches von currentNumber?
                //Alle Prime Nummmern sind FALSE
                if(numberToCheck % currentNumber == 0){
                    numbers[numberToCheck] = true;
                }
            }
        }

        return false;
    }

    @Override
    public void printPrimes() {
        isPrime(0);

        for (int i = 2; i < numbers.length; i++) {
            if(numbers[i] == false){
                System.out.println(i);
            }
        }
    }

    public boolean[] getNumbers() {
        return numbers;
    }
}
