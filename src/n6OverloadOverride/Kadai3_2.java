package n6OverloadOverride;

public class Kadai3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /** </PRE>
		 * 
		 * @param name
		 *            口座名義
		 * @param amount
		 *            口座開設時の預入金
		 */
		String name ="FOIS太郎";
		int amount = 100000;
		/**
		 * 1 銀行口座を開設する
		 * 
		 */
		BankAccount bc = new BankAccount(name, amount);
		/**
		 *2 引き出し処理50000円
		 */
		/**
		 * @param money
		 * 引き出し金額
		 */
		int money=50000;
		
		bc.output(money);
		
		/**
		 * 3 国外振り込み処理(10000円)

		 */
		/**
		 * @param transferAmount
		 * 振り込み金額
		 * 
		 */
		
		int transferAmount =10000;
		/**
		 * @param placeCode
		 * 取引先区分(int型)　※0：国内、1:国外
		 * 
		 */
		int placeCode=1;
		
		bc.output(placeCode, transferAmount);
		/**
		 * 4 国内振り込み処理(10000円)

		 */
		transferAmount=10000;
		placeCode=0;
		
		bc.output(placeCode, transferAmount);
		/**
		 * 5 預け入れ処理(100000円)
		 */
		/**
		 * @param inAmount
		 * 預け入れ処理(100000円)
		 * 
		 */
		int inAmount=100000;
		bc.input(inAmount);
		
		/**
		 * 6 残高照会
		 */
		bc.balanceInquiryPrint();
		
	}

}
