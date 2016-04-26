public class ChangeMaker {
	CoinChanger penny = new CoinChanger(1, "Penny");
	CoinChanger nickel = new CoinChanger(5, "Nickle");
	CoinChanger dime = new CoinChanger(10, "Dime");
	CoinChanger quarter = new CoinChanger(25, "Quarter");

	public static void main(String[] args) {
		ChangeMaker changemaker = new ChangeMaker(20, 10, 17, 9);
		changemaker.givechange(47);
	}

	ChangeMaker(int numpennys, int numdimes, int numnickels, int numquarters) {
		this.addpennys(numpennys);
		this.addnickels(numnickels);
		this.adddimes(numdimes);
		this.addquarters(numquarters);

	}

	void adddimes(int stock) {
		dime.addcoins(stock);
	}

	void addpennys(int stock) {
		penny.addcoins(stock);
	}

	void addnickels(int stock) {
		nickel.addcoins(stock);
	}

	void addquarters(int stock) {
		quarter.addcoins(stock);
	}

	void givechange(int num) {
		while (num > 0) {
			num = giveonecoin(num);
		}
	}

	int giveonecoin(int amount) {
		if (amount >= quarter.coinvalu) {
			if (quarter.hascoin()) {
				quarter.despensecoin();
				return amount - quarter.coinvalu;
			}
		}
		if (amount >= dime.coinvalu) {
			if (dime.hascoin()) {
				dime.despensecoin();
				return amount - dime.coinvalu;
			}
		}
		if (amount >= nickel.coinvalu) {
			if (nickel.hascoin()) {
				nickel.despensecoin();
				return amount - nickel.coinvalu;
			}
		}
		if (amount >= penny.coinvalu) {
			if (penny.hascoin()) {
				penny.despensecoin();
				return amount - penny.coinvalu;
			}
		}
		return 0;

	}
}
