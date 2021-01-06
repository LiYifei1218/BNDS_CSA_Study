package examples.ppt5;

public class PitchCount {
    public static void main(String[] args) {
        int[][] pitchArray = {
                {45, 105, 67},
                {81,100,93,25,128,88},
                {45,53},
                {79,107,53,79},
                {11,9,3,63,20,18,3}};

        for (int i = 0; i < pitchArray.length; i++) {
            int sum = 0;
            int max = pitchArray[i][0];
            int min = max;
            for (int j = 0; j < pitchArray[i].length; j++) {
                sum += pitchArray[i][j];
                if (pitchArray[i][j] > max)
                    max = pitchArray[i][j];
                if (pitchArray[i][j] < min)
                    min = pitchArray[i][j];
            }
            double avg = sum/ pitchArray[i].length;
            System.out.println("Pitcher #" + (i + 1) + " pitched " + pitchArray[i].length + " games, min " + min + ", max " + max + ", average " + avg);
        }
    }
}
