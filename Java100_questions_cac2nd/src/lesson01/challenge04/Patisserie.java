/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String args[]) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citron = 30;
		int chocola = 30;
		int pistache = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250　・・・　残り" + citron + "個");
		System.out.println("ショコラ      \\280　・・・　残り" + chocola + "個");
		System.out.println("ピスターシュ  \\320　・・・　残り" + pistache + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで)\n");
		System.out.println("シトロン      >");
		String citbuystr = reader.readLine();
		int citbuy = Integer.parseInt(citbuystr);

		System.out.println("ショコラ      >");
		String chocobuystr = reader.readLine();
		int chocobuy = Integer.parseInt(chocobuystr);

		System.out.println("ピスターシュ  >\n");
		String pisbuystr = reader.readLine();
		int pisbuy = Integer.parseInt(pisbuystr);

		System.out.println("\nシトロン     " + citbuy + "個");
		System.out.println("ショコラ     " + chocobuy + "個");
		System.out.println("ピスターシュ " + pisbuy + "個");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");
	}

}
