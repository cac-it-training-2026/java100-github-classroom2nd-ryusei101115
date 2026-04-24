/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		Double citbuy = Double.parseDouble(citbuystr);

		System.out.println("ショコラ      >");
		String chocobuystr = reader.readLine();
		Double chocobuy = Double.parseDouble(chocobuystr);

		System.out.println("ピスターシュ  >\n");
		String pisbuystr = reader.readLine();
		Double pisbuy = Double.parseDouble(pisbuystr);

		System.out.println("\nシトロン     " + citbuy + "個");
		System.out.println("ショコラ     " + chocobuy + "個");
		System.out.println("ピスターシュ " + pisbuy + "個");

		double count = citbuy + chocobuy + pisbuy;
		int gold = (int) (250 * citbuy + 280 * chocobuy + 320 * pisbuy);

		System.out.println("\n合計個数    " + count + "個");
		System.out.println("合計金額  " + gold + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citron = (int) (citron - citbuy);
		chocola = (int) (chocola - chocobuy);
		pistache = (int) (pistache - pisbuy);

		System.out.println("\n本日のおすすめの商品です。");
		System.out.println("\nシトロン      \\250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocola + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistache + "個");

	}

}
