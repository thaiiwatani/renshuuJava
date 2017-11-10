package n6OverloadOverride;

public class CheckingAccount extends BankAccount {

	CheckingAccount(String name, int amount) {
		super(name, amount);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void output(int money)
	{
		
		System.out.println("[説明] \n 引き出し処理を行うメソッド。");
		/**
		 * @param drowMoney
		 * 引き出し金額、引き出し手数料の合計 
		
		 */
		int drowMoney;
		if(getBalance()>=100000)
			drowMoney = money;
		else 
			drowMoney= money+2*getWithDrowCharge();
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
	@Override
	public void output(int transferAmount,int placeCode)
	{
		
		System.out.println("[説明] \n 振り込み処理を行うメソッド。");
		/**
		 *取引先区分(int型)　※0：国内、1:国外
		 */
		
		int transferAmountCharge;
		if (getBalance()>=100000) {
			transferAmountCharge=0;
			
		}
		else{
			
		if(placeCode==0)
			transferAmountCharge=2*getInsideTransferCharge();
		else 
			transferAmountCharge=2*getOutsideTransferCharge();
		}
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
