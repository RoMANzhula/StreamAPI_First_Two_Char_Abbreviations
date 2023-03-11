import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("Ukraine",  "France", "Canada",
                "Egypt", "Cocojunia", "Africa", "Greece", "Girafia", "German",
                "Kazakhstan", "Italy", "Belgium", "Japan", "Mexico", "Poland",
                "United Kingdom", "Spain", "Turkey", "Borjomi", "Latvia");

        System.out.println(getFirstTwoCharAbbreviations(list));
    }

    public static List<String> getFirstTwoCharAbbreviations(List<String> list) {
        List<String> listOfCountries = List.of("Ukraine", "France", "Canada", "Poland",
                "Egypt", "Kazakhstan", "Spain", "Greece", "Hungary", "German", "Italy", "Japan",
                "Latvia", "Mexico", "Turkey", "Africa", "Georgia", "United Kingdom",  "Belgium");
//        return list
//                .stream()
//                .filter(listOfCountries::contains)
//                .map(temp -> temp.substring(0, 2).toUpperCase())
//                .limit(14)
//                .collect(Collectors.toList());


        return Collections.singletonList(list
                .stream()
                .filter(listOfCountries::contains)
                .limit(14)
                .reduce("", (acc, val) -> acc + val.substring(0, 2).toUpperCase() + " ")); //Данное решение подсмотрел у Drona(Дмитрия)
    }
}
