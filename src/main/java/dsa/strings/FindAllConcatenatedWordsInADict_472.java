package dsa.strings;

import java.util.*;

public class FindAllConcatenatedWordsInADict_472 {

    public boolean isConcanated(String word, Set set, Map<String, Boolean> map) {
        if (map.containsKey(word)) {
            return map.get(word);
        }

        int l = word.length();
        for (int i = 0; i < l; i++) {
            String prefix = word.substring(0, i+1);
            String suffix = word.substring(i+1, l);

            if ((set.contains(prefix) && set.contains(suffix)) || (set.contains(prefix) && isConcanated(suffix, set, map))) {
                map.put(word, true);
                return true;
            }


        }
        map.put(word, false);
        return false;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {

        Map<String, Boolean> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(words));

        List<String> result = new ArrayList<>();
        for (String word: words) {
            if (isConcanated(word, set, map)) {
                result.add(word);
            }
        }


        return result;
    }
}
