/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		int citper = (int) ((250 * citbuy) / gold * 100);
		int choper = (int) ((280 * chocobuy) / gold * 100);
		int pisper = (int) ((320 * pisbuy) / gold * 100);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * citbuy) + "・・・" + citper + "%");
		System.out.println("ショコラ      \\" + (int) (280 * chocobuy) + "・・・" + choper + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pisbuy) + "・・・" + pisper + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味    ・・・" + citper + "%");
		System.out.println("ショコラの味    ・・・" + choper + "%");
		System.out.println("ピスターシュの味・・・" + pisper + "%");

		System.out.println("\nが楽しめます！\n");
		System.out.println("値段は\\" + ((gold / (int) count) / 10 * 10) + "です。");

	}

}
