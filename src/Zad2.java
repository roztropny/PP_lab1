import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Zad2 {
    final static int N = 100000;

    static BigInteger factorial( int n )
    {
        BigInteger product = new BigInteger("1");
        for (int j=2; j<=n; j++) {
            product = product.multiply(BigInteger.valueOf(j));
        }
        return product;
    }

    public static void main(String[] args){
        long startTime = System.nanoTime();

        NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
        System.out.println(formatter.format(factorial(N)));

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }
}
