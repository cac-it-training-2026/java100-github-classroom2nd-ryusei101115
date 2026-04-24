package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Robot {
	int energy;
	int water;
	String name;

	String makeAhiizyo(int ebiNum, int burokkoriNum, int redtougarasiNum, int whitekinokoNum,
			int ninnikuNum, int oliveNum) {
		int ebi = ebiNum;
		int burokkori = burokkoriNum;
		int redtougarasi = redtougarasiNum;
		int whitekinoko = whitekinokoNum;
		int ninniku = ninnikuNum;
		int olive = oliveNum;

		String menu = null;
		if ((ebi >= 50) && (burokkori >= 50) && (redtougarasi >= 1) && (whitekinoko >= 2)
				&& (ninniku >= 1) && (olive >= 100)) {
			menu = "アヒージョ";
		} else {
			menu = null;
		}
		return menu;
	}
}

class ClearRobot {
	void clearTable(int[] ingredients) {
		Arrays.fill(ingredients, 0);
	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("ロボットがアヒージョを作ってくれます。");
		System.out.println("あとかたづけもしてくれますよ。\n");
		System.out.println("それでは今ある材料の量を教えてください！\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("エビの量を入力してください（グラム）＞");
		String ebiNumStr = br.readLine();
		int ebiNum = Integer.parseInt(ebiNumStr);

		System.out.print("\nブロッコリーの量を入力してください（グラム）＞");
		String burokkoriNumStr = br.readLine();
		int burokkoriNum = Integer.parseInt(burokkoriNumStr);

		System.out.print("\n赤唐辛子の本数を入力してください（本）＞");
		String redtougarasiNumStr = br.readLine();
		int redtougarasiNum = Integer.parseInt(redtougarasiNumStr);

		System.out.print("\nホワイトマッシュルームの個数を入力してください（個）＞");
		String whitekinokoNumStr = br.readLine();
		int whitekinokoNum = Integer.parseInt(whitekinokoNumStr);

		System.out.print("\nにんにくの個数を入力してください（個）＞");
		String ninnikuNumStr = br.readLine();
		int ninnikuNum = Integer.parseInt(ninnikuNumStr);

		System.out.print("\nオリーブオイルの量を入力してください（cc）＞");
		String oliveNumStr = br.readLine();
		int oliveNum = Integer.parseInt(oliveNumStr);

		Robot robot = new Robot();
		String menu = robot.makeAhiizyo(ebiNum, burokkoriNum, redtougarasiNum, whitekinokoNum,
				ninnikuNum, oliveNum);
		if (menu != null) {
			System.out.println("\n" + menu + "が出来ました。");
			System.out.println("\nあとかたづけをします。\n");
			int[] ingredients = new int[6];
			ingredients[0] = ebiNum;
			ingredients[1] = burokkoriNum;
			ingredients[2] = redtougarasiNum;
			ingredients[3] = whitekinokoNum;
			ingredients[4] = ninnikuNum;
			ingredients[5] = oliveNum;

			ClearRobot clearRobot = new ClearRobot();
			clearRobot.clearTable(ingredients);

			System.out.println("エビ                    ：" + ingredients[0] + "g");
			System.out.println("ブロッコリー            ：" + ingredients[1] + "g");
			System.out.println("赤唐辛子                ：" + ingredients[2] + "本");
			System.out.println("ホワイトマッシュルーム  ：" + ingredients[3] + "個");
			System.out.println("にんにく                ：" + ingredients[4] + "個");
			System.out.println("オリーブオイル          ：" + ingredients[5] + "cc");

			System.out.println("\nきれいになりました。");
		} else {
			System.out.println("\n材料が足りません！");
		}

	}

}
