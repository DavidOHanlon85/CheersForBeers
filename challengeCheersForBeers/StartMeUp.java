/**
 * 
 */
package challengeCheersForBeers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class StartMeUp {

	/**
	 * @param args
	 */

	private static final double PERCENTAGE_ALCOHOL_BOUNDARY = 6.0;

	public static void main(String[] args) {

		List<Beer> beers = readAllBeersToArrayList();

		int input = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Please select an option: ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Show all beers");
				System.out.println();
				displayAllBeers(beers);
				break;
			case 2:
				Collections.sort(beers, new SortByName());
				displayAllBeers(beers);
				break;
			case 3:

				File beerInfo = new File("Beers Over 6%.txt");

				try {
					FileWriter fw = new FileWriter(beerInfo, false);
					BufferedWriter bw = new BufferedWriter(fw);

					writeBeerInformationToFile(beers, bw);

					System.out.println("Document ready");

					bw.close();
					fw.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("Quitting - Have a good day!");
				break;
			default:
				System.out.println("Invalid entry - Please try again");
			}

		} while (input != 4);

	}

	/**
	 * This method writes the beer information required to file - constant can be
	 * changed to allow variation in alcohol content boundary
	 * 
	 * @param beers
	 * @param bw
	 * @throws IOException
	 */
	public static void writeBeerInformationToFile(List<Beer> beers, BufferedWriter bw) throws IOException {
		bw.write("All beers over " + PERCENTAGE_ALCOHOL_BOUNDARY + "%\n\n");

		for (Beer b : beers) {
			if (b.getAlcoholPercentage() > PERCENTAGE_ALCOHOL_BOUNDARY) {
				bw.write("Beer Name          : " + b.getBeerName());
				bw.write("\n");
				bw.write("Beer Style         : " + b.getBeerStyle());
				bw.write("\n");
				bw.write("Country            : " + b.getCountry());
				bw.write("\n");
				bw.write("Alcohol Percentage : " + b.getAlcoholPercentage());
				bw.write("\n");
				bw.write("\n");
			}
		}
	}

	/**
	 * This method displays all beers to console
	 * 
	 * @param beers
	 */
	public static void displayAllBeers(List<Beer> beers) {
		for (Beer b : beers) {
			b.showAllDetails();
		}
	}

	/**
	 * This method reads all beers to an array list
	 * 
	 * @return
	 */
	public static List<Beer> readAllBeersToArrayList() {
		List<Beer> beers = new ArrayList<Beer>();

		File file = new File("beer_data-1.csv");

		String line;

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// Read heading column
			line = br.readLine();
			// System.out.println(line);

			line = br.readLine();

			while (line != null) {

				String[] splitDetails = line.split(",");

				String beerName = splitDetails[0];
				String beerStyle = splitDetails[1];
				String country = splitDetails[2];
				double alcoholPercentage = Double.parseDouble(splitDetails[3]);

				beers.add(new Beer(beerName, beerStyle, country, alcoholPercentage));

				line = br.readLine();

			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return beers;
	}

}
