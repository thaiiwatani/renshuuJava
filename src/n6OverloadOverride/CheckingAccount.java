package n6OverloadOverride;

public class CheckingAccount extends BankAccount {

	CheckingAccount(String name, int amount) {
		super(name, amount);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void output(int money)
	{
		
		System.out.println("[����] \n �����o���������s�����\�b�h�B");
		/**
		 * @param drowMoney
		 * �����o�����z�A�����o���萔���̍��v 
		
		 */
		int drowMoney;
		if(getBalance()>=100000)
			drowMoney = money;
		else 
			drowMoney= money+2*getWithDrowCharge();
		if(drowMoney>getBalance())
		{
			System.out.println("�a���c��������܂���B");
		}
		else
		{
			
			System.out.println("�O�̗a���c����"+getBalance()+"�~�ł�");
			int nowBalance=getBalance()-drowMoney;
			setBalance(nowBalance);
			System.out.println("�a���c����"+getBalance()+"�~�ł�");
			System.out.println("�����o���萔��"+getWithDrowCharge()+"�~�ł�");
			
		}
		
	}
	@Override
	public void output(int transferAmount,int placeCode)
	{
		
		System.out.println("[����] \n �U�荞�ݏ������s�����\�b�h�B");
		/**
		 *�����敪(int�^)�@��0�F�����A1:���O
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
			System.out.println("�a���c��������܂���B");
		}
		else
		{
			System.out.println("�O�̗a���c����"+getBalance()+"�~�ł�");
			
			setBalance(getBalance()-drowMoney);
			System.out.println("�a���c����"+getBalance()+"�~�ł�");
			System.out.println("�U�荞�ݎ萔��"+transferAmountCharge+"�~�ł�");
			
		}
	}
	

}
