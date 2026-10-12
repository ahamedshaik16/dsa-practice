package dsa.strings;

public class NumberOfCitizens_2678 {
    public static void main(String[] args) {
        NumberOfCitizens_2678 n = new NumberOfCitizens_2678();
        String[] details = {"1313579440F2036","2921522980M5644"};
        System.out.println(n.countSeniors(details));
    }

    public int countSeniors(String[] details) {
        int count = 0;
        for (String each: details) {
            String result = each.substring(11, 13);
            if (Integer.parseInt(result) >= 60) {
                count += 1;
            }

        }
        return count;
    }
}
