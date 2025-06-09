//exercise 11
public class JavaExercisesSolutions {
    public static double sumNumbers(List<? extends Number > numbers){
        return numbers.stream() Stream<capture of extends Number>
        .mapToDouble(Number::doubleValue) DoubleStream
                .sum();
                @FunctionalInterface

    }
}
