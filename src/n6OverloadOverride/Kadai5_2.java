package n6OverloadOverride;

public class Kadai5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** </PRE>
		 * 
		 * @param name
		 *            ŒûÀ–¼‹`
		 * @param amount
		 *            ŒûÀŠJİ‚Ì—a“ü‹à
		 */
		String name ="FOIS‘¾˜Y";
		int amount = 150000;
		/**
		 * 1 ‹âsŒûÀ‚ğŠJİ‚·‚é
		 * 
		 */
		CheckingAccount ca = new CheckingAccount(name, amount);
		/**
		 *2 ˆø‚«o‚µˆ—50000‰~
		 */
		/**
		 * @param money
		 * ˆø‚«o‚µ‹àŠz
		 */
		int money=50000;

		ca.output(money);
		
		/**
		 * 3 ‘ŠOU‚è‚İˆ—(10000‰~)

		 */
		/**
		 * @param transferAmount
		 * U‚è‚İ‹àŠz
		 * 
		 */
		
		int transferAmount =10000;
		/**
		 * @param placeCode
		 * æˆøæ‹æ•ª(intŒ^)@¦0F‘“àA1:‘ŠO
		 * 
		 */
		int placeCode=1;
		
		ca.output(placeCode, transferAmount);
		/**
		 * 4 ‘“àU‚è‚İˆ—(10000‰~)

		 */
		transferAmount=10000;
		placeCode=0;
		
		ca.output(placeCode, transferAmount);
		/**
		 * 5 —a‚¯“ü‚êˆ—(100000‰~)
		 */
		/**
		 * @param inAmount
		 * —a‚¯“ü‚êˆ—(100000‰~)
		 * 
		 */
		int inAmount=100000;
		ca.input(inAmount);
		
		/**
		 * 6 c‚Æ‰ï
		 */
		ca.balanceInquiryPrint();

	}

}
