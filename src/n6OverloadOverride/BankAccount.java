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
	 * �����敪�i�����j
	 */
	public static final int INSIDE_COUNTRY = 0;

	/**
	 * �����敪�i���O�j
	 */
	public static final int OUTSIDE_COUNTRY = 1;

	/**
	 * �U���ݎ萔���i�����j��l
	 */
	public static final int INSIDE_TRANSFER_CHARGE = 210;

	/**
	 * �U���ݎ萔���i���O�j��l
	 */
	public static final int OUTSIDE_TRANSFER_CHARGE = 415;

	/**
	 * ���o���萔�� ��l
	 */
	public static final int WITH_DROW_CHARGE = 105;
	/** �������` */
	private String name;

	/** �a���c�� */
	private int balance;

	/** �U���ݎ萔���i�����j */
	private int insideTransferCharge;

	/** �U���ݎ萔���i���O�j */
	private int outsideTransferCharge;

	/** ���o���萔�� */
	private int withDrowCharge;

	/**
	 * �a���c�����擾����B
	 * 
	 * @return �a���c��
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * �a���c����ݒ肷��B
	 * 
	 * @param balance
	 *            �a���c��
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}
	/**
	 * �U���ݎ萔���i�����̏ꍇ�j��ݒ肷��B
	 * 
	 * @param insideTransferCharge
	 *            �U�荞�ݎ萔��
	 */
	public void setInsideTransferCharge(int insideTransferCharge) {
		this.insideTransferCharge = insideTransferCharge;
	}

	/**
	 * �U���ݎ萔���i�����̏ꍇ�j���擾����B
	 * 
	 * @return �U�荞�ݎ萔��
	 */
	public int getInsideTransferCharge() {
		return insideTransferCharge;
	}

	/**
	 * �U���ݎ萔���i���O�̏ꍇ�j��ݒ肷��B
	 * 
	 * @param outsideTransferCharge
	 *            �U�荞�ݎ萔��
	 */
	public void setOutsideTransferCharge(int outsideTransferCharge) {
		this.outsideTransferCharge = outsideTransferCharge;
	}

	/**
	 * �U���ݎ萔���i���O�̏ꍇ�j���擾����B
	 * 
	 * @return �U�荞�ݎ萔��
	 */
	public int getOutsideTransferCharge() {
		return outsideTransferCharge;
	}

	/**
	 * ���o���萔����ݒ肷��B
	 * 
	 * @param withDrowCharge
	 *            ���o���萔��
	 */
	public void setWithDrowCharge(int withDrowCharge) {
		this.withDrowCharge = withDrowCharge;
	}

	/**
	 * ���o���萔�����擾����B
	 * 
	 * @return ���o���萔��
	 */
	public int getWithDrowCharge() {
		return withDrowCharge;
	}

	/**
	 * �R���X�g���N�^
	 * 
	 * <PRE>
	 * 
	 * �����l�̐ݒ�
	 * 
	 * </PRE>
	 * 
	 * @param name
	 *            �������`
	 * @param amount
	 *            �����J�ݎ��̗a����
	 */
	BankAccount(String name, int amount) {
		this.name = name;
		this.balance = amount;
		this.insideTransferCharge = INSIDE_TRANSFER_CHARGE;
		this.outsideTransferCharge = OUTSIDE_TRANSFER_CHARGE;
		this.withDrowCharge = WITH_DROW_CHARGE;
	}

	/**
	 * �u�a����v����
	 * 
	 * @param inAmount
	 *            �a����
	 */
	public void input(int inAmount) {

		this.balance = this.balance + inAmount;

	}

	/**
	 * �u�c���Ɖ�v����
	 * 
	 */
	public void balanceInquiryPrint() {

		System.out.println(this.name + "�l�̗a���c����" + this.balance + "�~�ł��B");

	}
	
	/**
	 * out put method
	 * 
	 */
	public void output(int money)
	{
		
		System.out.println("[����] \n �����o���������s�����\�b�h�B");
		/**
		 * @param drowMoney
		 * �����o�����z�A�����o���萔���̍��v 
		 */
		int drowMoney = money+getWithDrowCharge();
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
	public void output(int transferAmount,int placeCode)
	{
		
		System.out.println("[����] \n �U�荞�ݏ������s�����\�b�h�B");
		/**
		 *�����敪(int�^)�@��0�F�����A1:���O
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
