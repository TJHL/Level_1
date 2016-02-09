import javax.swing.JOptionPane;

public class Month {
	int days;
	String name;
	Month nextmonth;

	public static void main(String[] args) {
		Month january = new Month(31, "January");
		Month febuary = new Month(29, "Febuary");
		Month march = new Month(31, "March");
		Month april = new Month(30, "April");
		Month may = new Month(31, "May");
		Month june = new Month(30, "June");
		Month july = new Month(31, "July");
		Month august = new Month(31, "August");
		Month september = new Month(30, "September");
		Month october = new Month(31, "October");
		Month november = new Month(30, "November");
		Month december = new Month(31, "December");
		january.setNextmonth(febuary);
		febuary.setNextmonth(march);
		march.setNextmonth(april);
		april.setNextmonth(june);
		may.setNextmonth(june);
		june.setNextmonth(july);
		july.setNextmonth(august);
		august.setNextmonth(september);
		september.setNextmonth(october);
		october.setNextmonth(november);
		november.setNextmonth(december);
		december.setNextmonth(january);

		JOptionPane.showInputDialog("Name a month");

	}

	public Month(int days, String name) {
		this.name = name;
		this.days = days;
	}

	public Month getNextmonth() {
		return nextmonth;
	}

	public void setNextmonth(Month nextmonth) {
		this.nextmonth = nextmonth;
	}

}
