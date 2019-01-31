package pandaybr;

/**
 * Inventory class used to create inventory objects, with default values for
 * default constructor objects.
 * 
 * @author brandon
 *
 */
// comment
public class Inventory {
	private String id;
	private String name = "New Item";
	private int qoh = 0;
	private int rop = 25;
	private double sellPrice = 0;

	/**
	 * Default constructor.
	 */
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventory(String id, String name, double sellPrice) {
		super();
		this.id = id;
		this.name = name;
		this.sellPrice = sellPrice;
	}

	public Inventory(String id, String name, int qoh, int rop,
			double sellPrice) {
		super();
		this.id = id;
		this.name = name;
		this.qoh = qoh;
		this.rop = rop;
		this.sellPrice = sellPrice;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public int getRop() {
		return rop;
	}

	public void setRop(int rop) {
		this.rop = rop;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	/**
	 * Inventory object toString Method, formatted to display inventory object
	 * after entry.
	 */
	@Override
	public String toString() {
		return id + "(" + name + ")" + ", " + "QOH: " + qoh + " " + "Price: "
				+ sellPrice;
	}

}
