package optymalizacja6022;

import java.util.stream.Stream;
import java.util.stream.IntStream;

class TrojkiPitagorejskie {
    Stream<double[]> Trojki1 = IntStream.rangeClosed(1, 100)
            .boxed()
            .flatMap(a -> IntStream.rangeClosed(a, 100)
                    .mapToObj(b -> new double[] {a,b, Math.sqrt(a*a+b*b)})
                    .filter(t -> t[2] % 1 == 0));
}

public class Main {
    public static void main(String[] args)
    {
        TrojkiPitagorejskie pt = new TrojkiPitagorejskie();

        System.out.println("progream generuje 10 trojek pitagorejskich: ");
        System.out.println("");

        pt.Trojki1
                .limit(10)
                .forEach(t -> System.out.println("(" + t[0] + ", " + t[1] + ", " + t[2] +")"));
    }
}
