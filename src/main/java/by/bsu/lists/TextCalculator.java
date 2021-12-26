package by.bsu.lists;

import java.util.List;
import java.util.stream.Collectors;

public class TextCalculator {
    public List<String> findWordsThatHasA(List<String> text) {
        return text.stream()
                .filter(X ->X.contains("a") )
                .collect(Collectors.toList());
    }

    public List<String> findWordsThatStartWithCapital(List<String> text){
        return text.stream()
                .filter(string->string.matches("^[A-Z].*"))
                .collect(Collectors.toList());
    }
    public List<Integer> findWordsThatGreaterThanX(List<Integer> numbers, int x){
        return numbers.stream()
                .filter(X->X>x)
                .collect(Collectors.toList());
    }

}
