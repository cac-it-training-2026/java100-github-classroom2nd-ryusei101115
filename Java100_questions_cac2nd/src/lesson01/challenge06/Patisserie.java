/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int count = citbuy + chocobuy + pisbuy;
		int gold = 250 * citbuy + 280 * chocobuy + 320 * pisbuy;

		System.out.println("\n合計個数    " + count + "個");
		System.out.println("合計金額  " + gold + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citron = citron - citbuy;
		chocola = chocola - chocobuy;
		pistache = pistache - pisbuy;

		System.out.println("\n本日のおすすめの商品です。");
		System.out.println("\nシトロン      \\250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocola + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistache + "個");

	}

}
