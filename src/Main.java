void main() {
    //Task1

//    List<Integer> list = List.of(1,5,3,7,6);
//    List<Integer> result = filter(list,x -> x % 2 == 0);
//    System.out.println(result);

    //Task2

    List<String> list = List.of("a","bb","ccc","dddd");
    List<Integer> result = myMap(list,x -> x.length());
    System.out.println(result);

    myForEach(list,s -> System.out.println(s));





}

//public static <T> List<T> filter(List<T> list, Predicate<T> condition){
//    List<T> result = new ArrayList<>();
//
//    for(T item : list){
//        if(condition.test(item)){
//            result.add(item);
//        }
//    }
//
//    return result;
//}

public static <T, R> List<R> myMap(List<T> list, Function<T, R> function) {
    List<R> result = new ArrayList<>();
    for (T item : list) {
        result.add(function.apply(item));
    }
    return result;
}

public static <T> void myForEach(List<T> list, Consumer<T> consumer) {
    for (T item : list) {
        consumer.accept(item);
    }
}


