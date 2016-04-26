public class CoinChanger {
	int coinstock;
	int coinvalu;
	String type;

	public static void main(String[] args) {
		CoinChanger penny = new CoinChanger(1, "Pennys");
		CoinChanger nickel = new CoinChanger(5, "Nickles");
		CoinChanger dime = new CoinChanger(10, "Dimes");
		CoinChanger quarter = new CoinChanger(25, "Quarters");
		penny.addcoins(10);

		penny.despensecoin();
	}

	CoinChanger(int coinvalu, String type) {
		this.coinvalu = coinvalu;
		coinstock = 0;
	}

	void addcoins(int stock) {
		coinstock = coinstock + stock;
		System.out.println(stock + " coins have been added to the coinchanger.");
		System.out.println(coinstock + " stock has this many coins");
	}

	boolean hascoin() {
		return coinstock > 0;

	}

	void despensecoin() {
		if (coinstock <= 0) {
			System.out.println("Were sorry, this atomated change dispesnes "
					+ "has ran out of change. Please wait patualy untill a operrater can refill this machine");
		} else {
			coinstock = coinstock - 1;
			System.out.println("one coin dispensed: " + coinvalu);
		}
	}
}