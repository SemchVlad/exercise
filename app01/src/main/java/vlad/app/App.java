package vlad.app;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;

/**
 *
 * v.semchenko
 */
public class App 
{
    public static void main( String[] args )
    {
        Pair<Integer, String> p1 = new Pair<>(2, "bb");
        Pair<Integer, String> p2 = new Pair<>(1, "aa");

        System.out.println(concatSorted(Arrays.asList(p1, p2)));
        System.out.println(concatSorted(Arrays.asList(p2, p1)));
        System.out.println(concatSorted(Arrays.asList(p1)));
        System.out.println(concatSorted(Arrays.asList()));
    }

    private static String concatSorted(List<Pair<Integer,String>> list) {
        return list.stream().sorted(Comparator.comparing(p -> p.getFirst())).map(s -> s.getSecond()).collect(Collectors.joining(","));
    }

    public static void handle(Event<Pair<Integer,String>> event, BiConsumer<? super Integer, ? super String> consumer) {
        consumer.accept(event.getData().getFirst(), event.getData().getSecond());
    }
}


