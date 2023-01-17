import java.util.List;

public class Scores {
    public static int getTotalScore(List<Integer> scores) {
        if (scores.size() > 11) {
            return -1;
        }
        int totalScore = 0;
        for (int score : scores) {
            totalScore += score;
        }
        return totalScore;
    }

    public static void main(String[] args) {
        List<Integer> scores = List.of(78, 94, 98, 34, 45, 56, 87, 86, 79, 90, 98);
        int totalScore = getTotalScore(scores);
        if (totalScore == -1) {
            System.out.println(" Invali input");
        } else {
            System.out.println(" Total Score=" + totalScore);
        }
    }
}
