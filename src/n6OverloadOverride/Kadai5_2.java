package n6OverloadOverride;

public class Kadai5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** </PRE>
		 * 
		 * @param name
		 *            �������`
		 * @param amount
		 *            �����J�ݎ��̗a����
		 */
		String name ="FOIS���Y";
		int amount = 150000;
		/**
		 * 1 ��s�������J�݂���
		 * 
		 */
		CheckingAccount ca = new CheckingAccount(name, amount);
		/**
		 *2 �����o������50000�~
		 */
		/**
		 * @param money
		 * �����o�����z
		 */
		int money=50000;

		ca.output(money);
		
		/**
		 * 3 ���O�U�荞�ݏ���(10000�~)

		 */
		/**
		 * @param transferAmount
		 * �U�荞�݋��z
		 * 
		 */
		
		int transferAmount =10000;
		/**
		 * @param placeCode
		 * �����敪(int�^)�@��0�F�����A1:���O
		 * 
		 */
		int placeCode=1;
		
		ca.output(placeCode, transferAmount);
		/**
		 * 4 �����U�荞�ݏ���(10000�~)

		 */
		transferAmount=10000;
		placeCode=0;
		
		ca.output(placeCode, transferAmount);
		/**
		 * 5 �a�����ꏈ��(100000�~)
		 */
		/**
		 * @param inAmount
		 * �a�����ꏈ��(100000�~)
		 * 
		 */
		int inAmount=100000;
		ca.input(inAmount);
		
		/**
		 * 6 �c���Ɖ�
		 */
		ca.balanceInquiryPrint();

	}

}
