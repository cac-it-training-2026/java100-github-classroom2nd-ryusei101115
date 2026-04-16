/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + gold);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * citbuy) + "・・・" + (int) ((250 * citbuy) / gold * 100) + "%");
		System.out
				.println("ショコラ      \\" + (int) (280 * chocobuy) + "・・・" + (int) ((280 * chocobuy) / gold * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pisbuy) + "・・・" + (int) ((320 * pisbuy) / gold * 100) + "%");

	}

}
