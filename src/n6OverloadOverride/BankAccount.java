package n6OverloadOverride;


class User
{
	String user, pass;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public User()
	{
		
	}
	public User(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	
	
}
public class BankAccount {
	
	/**
	 * 取引先区分（国内）
	 */
	public static final int INSIDE_COUNTRY = 0;

	/**
	 * 取引先区分（国外）
	 */
	public static final int OUTSIDE_COUNTRY = 1;

	/**
	 * 振込み手数料（国内）基準値
	 */
	public static final int INSIDE_TRANSFER_CHARGE = 210;

	/**
	 * 振込み手数料（国外）基準値
	 */
	public static final int OUTSIDE_TRANSFER_CHARGE = 415;

	/**
	 * 引出し手数料 基準値
	 */
	public static final int WITH_DROW_CHARGE = 105;
	/** 口座名義 */
	private String name;

	/** 預金残高 */
	private int balance;

	/** 振込み手数料（国内） */
	private int insideTransferCharge;

	/** 振込み手数料（国外） */
	private int outsideTransferCharge;

	/** 引出し手数料 */
	private int withDrowCharge;

	/**
	 * 預金残高を取得する。
	 * 
	 * @return 預金残高
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * 預金残高を設定する。
	 * 
	 * @param balance
	 *            預金残高
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/**
	 * 振込み手数料（国内の場合）を設定する。
	 * 
	 * @param insideTransferCharge
	 *            振り込み手数料
	 */
	public void setInsideTransferCharge(int insideTransferCharge) {
		this.insideTransferCharge = insideTransferCharge;
	}

	/**
	 * 振込み手数料（国内の場合）を取得する。
	 * 
	 * @return 振り込み手数料
	 */
	public int getInsideTransferCharge() {
		return insideTransferCharge;
	}

	/**
	 * 振込み手数料（国外の場合）を設定する。
	 * 
	 * @param outsideTransferCharge
	 *            振り込み手数料
	 */
	public void setOutsideTransferCharge(int outsideTransferCharge) {
		this.outsideTransferCharge = outsideTransferCharge;
	}

	/**
	 * 振込み手数料（国外の場合）を取得する。
	 * 
	 * @return 振り込み手数料
	 */
	public int getOutsideTransferCharge() {
		return outsideTransferCharge;
	}

	/**
	 * 引出し手数料を設定する。
	 * 
	 * @param withDrowCharge
	 *            引出し手数料
	 */
	public void setWithDrowCharge(int withDrowCharge) {
		this.withDrowCharge = withDrowCharge;
	}

	/**
	 * 引出し手数料を取得する。
	 * 
	 * @return 引出し手数料
	 */
	public int getWithDrowCharge() {
		return withDrowCharge;
	}

	/**
	 * コンストラクタ
	 * 
	 * <PRE>
	 * 
	 * 初期値の設定
	 * 
	 * </PRE>
	 * 
	 * @param name
	 *            口座名義
	 * @param amount
	 *            口座開設時の預入金
	 */
	BankAccount(String name, int amount) {
		this.name = name;
		this.balance = amount;
		this.insideTransferCharge = INSIDE_TRANSFER_CHARGE;
		this.outsideTransferCharge = OUTSIDE_TRANSFER_CHARGE;
		this.withDrowCharge = WITH_DROW_CHARGE;
	}

	/**
	 * 「預入れ」処理
	 * 
	 * @param inAmount
	 *            預入金
	 */
	public void input(int inAmount) {

		this.balance = this.balance + inAmount;

	}

	/**
	 * 「残高照会」処理
	 * 
	 */
	public void balanceInquiryPrint() {

		System.out.println(this.name + "様の預金残高は" + this.balance + "円です。");

	}
	
	/**
	 * out put method
	 * 
	 */
	public void output(int money)
	{
		
		System.out.println("[説明] \n 引き出し処理を行うメソッド。");
		/**
		 * @param drowMoney
		 * 引き出し金額、引き出し手数料の合計 
		 */
		int drowMoney = money+getWithDrowCharge();
		if(drowMoney>getBalance())
		{
			System.out.println("預金残高が足りません。");
		}
		else
		{
			System.out.println("前の預金残高は"+getBalance()+"円です");
			int nowBalance=getBalance()-drowMoney;
			setBalance(nowBalance);
			System.out.println("預金残高は"+getBalance()+"円です");
			System.out.println("引き出し手数料"+getWithDrowCharge()+"円です");
			
		}
		
	}
	public void output(int transferAmount,int placeCode)
	{
		
		System.out.println("[説明] \n 振り込み処理を行うメソッド。");
		/**
		 *取引先区分(int型)　※0：国内、1:国外
		 */
		
		int transferAmountCharge;
		if(placeCode==0)
			transferAmountCharge=getInsideTransferCharge();
		else 
			transferAmountCharge=getOutsideTransferCharge();
		System.out.println("transferAmountCharge"+transferAmountCharge);
		int drowMoney = transferAmount+transferAmountCharge;
		if(drowMoney>getBalance())
		{
			System.out.println("預金残高が足りません。");
		}
		else
		{
			System.out.println("前の預金残高は"+getBalance()+"円です");
			
			setBalance(getBalance()-drowMoney);
			System.out.println("預金残高は"+getBalance()+"円です");
			System.out.println("振り込み手数料"+transferAmountCharge+"円です");
			
		}
	}


	
}
