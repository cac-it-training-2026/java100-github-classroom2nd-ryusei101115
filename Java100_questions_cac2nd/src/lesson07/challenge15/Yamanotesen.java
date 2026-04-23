package lesson07.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！    \n");

		String[] station = { "東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町",
				"渋谷", "田町", "恵比寿", "有楽町", "目黒", "大崎", "原宿",
				"品川", "目白", "大塚", "上野", "池袋", "日暮里", "西日暮里",
				"駒込", "田端", "高田馬場", "神田", "鶯谷", "代々木", "新大久保",
				"巣鴨", "高輪ゲートウェイ" };

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		Random rand = new Random();

		boolean hit = false;

		int count = 0;

		boolean[] stationflag = new boolean[station.length];

		Arrays.fill(stationflag, true);

		do {
			String stname = reader.readLine();

			for (int i = 0; i < station.length; i++) {

				if (station[i].equals(stname)) {

					if (stationflag[i]) {
						hit = true;
						stationflag[i] = false;
						break;
					} else {
						break;
					}
				}
			}

			count++;

			if (!hit || (count == station.length)) {
				break;
			}

			hit = false;

			while (!hit) {
				int num = rand.nextInt(station.length);

				if (stationflag[num]) {
					System.out.println(station[num]);
					stationflag[num] = false;
					hit = true;
				}
			}

			count++;
			hit = false;

		} while (count != station.length);

		if (count == station.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}

	}

}
