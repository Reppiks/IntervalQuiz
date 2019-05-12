package IntervalQuiz;

import java.util.Random;

public class QuizBuilder {

    private String[][] keys = {
        {"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"},
        {"G", "Ab", "A", "Bb", "B", "C", "Db", "D",  "Eb", "E", "F", "F#"},
        {"D", "Eb", "E", "F", "F#", "G", "Ab", "A",  "Bb", "B", "C", "C#"},
        {"A", "Bb", "B", "C", "C#", "D", "Eb", "E",  "F", "F#", "G", "G#"},
        {"E", "F", "F#", "G", "G#", "A", "Bb", "B",  "C", "C#", "D", "D#"},
        {"B", "C", "C#", "D", "D#", "E", "F", "F#",  "G", "G#", "A", "A#"},
        {"F#", "G", "G#", "A", "A#", "B", "C", "C#",  "D", "D#", "E", "E#"},
        {"Db", "Ebb", "Eb", "Fb", "F", "Gb", "Abb", "Ab",  "Bbb", "Bb", "Cb", "C"},
        {"Ab", "Bbb", "Bb", "Cb", "C", "Db", "Ebb", "Eb", "Fb", "F", "Gb", "G"},
        {"Eb", "Fb", "F", "Gb", "G", "Ab", "Bbb", "Bb",  "Cb", "C", "Db", "D"},
        {"Bb", "Cb", "C", "Db", "D", "Eb", "Fb", "F",  "Gb", "G", "Ab", "A"},
        {"F", "Gb", "G", "Ab", "A", "Bb", "Cb", "C",  "Db", "D", "Eb", "E"},
    };

    Random random = new Random();

    // generates a random starting point i.e. "root note"
    public int getRoot() {
        int root = random.nextInt(12);
        return root;
    }

    // generates a random distance i.e. "interval"
    public int getDistance() {
        int distance = random.nextInt(11) + 1;
        return distance;
    }

    // returns String version of root note for UI
    public String getRootName(int root) {
        String startNote = keys[root][0];
        return startNote;
    }

    // returns String version of interval for UI
    public String getIntervalName(int distance) {

        String intervalStr;
        switch (distance) {
            case 1:
                intervalStr = "minor 2nd";
                break;
            case 2:
                intervalStr = "Major 2nd";
                break;
            case 3:
                intervalStr = "minor 3nd";
                break;
            case 4:
                intervalStr = "Major 3rd";
                break;
            case 5:
                intervalStr = "Perfect 4th";
                break;
            case 6:
                intervalStr = "Lowered 5th (Tritone)";
                break;
            case 7:
                intervalStr = "Perfect 5th";
                break;
            case 8:
                intervalStr = "minor 6th";
                break;
            case 9:
                intervalStr = "Major 6th";
                break;
            case 10:
                intervalStr = "minor 7th";
                break;
            case 11:
                intervalStr = "Major 7th";
                break;
            default:
                intervalStr = "error";
        }
        return intervalStr;
    }

    // combines above data to create a complete answer for each quiz problem
    public String getAnswer(int root, int distance) {

        String answer = keys[root][distance];

        return answer;
    }
}
