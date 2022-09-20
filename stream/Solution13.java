package stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution13 { 
  public List<String> findPeople(List<String> male, List<String> female, String lastName) {
    List<String> result = 
    Stream.concat(male.stream(), female.stream())
    .distinct()
    .filter(n -> n.startsWith(lastName))
    .sorted()
    .collect(Collectors.toList());
    return result;
  }
}
