public class Rational {

    private int num;
    private int denom;

    public Rational() {
	this.num = 1;
	this.denom = 1;
    }

    public Rational(int num, int denom) {
	this.num = num;
	this.denom = denom;
    }

    @Override
    public String toString() {
	    return num + "/" + denom;
    }

    /**
     For testing getters.
     */

    public static void main (String [] args) {
	    Rational r = new Rational(5,7);
	    System.out.println("r.getNumerator()=" + r.getNumerator());
	    System.out.println("r.getDenominator()=" + r.getDenominator());
    }

   public int getNumerator() { return this.num; }
   public int getDenominator() { return this.denom; } 
}
