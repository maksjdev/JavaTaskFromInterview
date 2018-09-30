public class Task {

    public static int sumofDigits(int N) {
        int num, sum = 0;
        double buff;

        for (int i = 1; i <= N; i++) {
            if (i < 10)
                sum += i;
            else {
                buff = i;
                num = i;
                while (buff > 9) {
                    buff /= 10;
                    num /= 10;
                    sum += (buff - num) * 10;
                }
                sum += num;
            }

        }
        return sum;
    }
}
