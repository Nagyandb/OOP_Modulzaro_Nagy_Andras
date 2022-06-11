package hu.progmatic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Matches> matches = null;
        try {
            matches = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader("matches_all.csv"))) {
                String line;

                reader.readLine();

                while ((line = reader.readLine()) != null) {
                    Matches match = new Matches(line);
                    matches.add(match);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("A mérkőzések száma: " + matches.size());
        } catch (Exception e) {
            e.printStackTrace();
        }


        // GYAKORLAT / 2. – MAXIMÁLIS GÓLKÜLÖNBSÉG
        System.out.println("Kérek egy évszámot!");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        int max = Integer.MIN_VALUE;

        for (Matches matchek : matches) {
            int sum = 0;
            if (matchek.getYear() == year) {
                sum = Math.abs(matchek.getGoalsA()-matchek.getGoalsB());
                        if (sum > max)
                            max = sum;
            }
        } System.out.println("Legnagyobb gólkülönbség a bajnokságon: " + max);



        try (PrintWriter writer = new PrintWriter("selected.csv")) {
            writer.println("year;stage;date;team_a;team_b;goals_a;goals_b;penalties_a;penalties_b");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}