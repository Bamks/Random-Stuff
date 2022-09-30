package Assignments;

public class Fraction {
    private int numer;
    private int denom;

    public Fraction() {
        this.numer = 0;
        this.denom = 0;
    }

    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public void setDenominator(int denom) {
        this.denom = denom;
    }

    public void setNumerator(int numer) {
        this.numer = numer;
    }
  
    public void setAll(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public int getNumerator(){
        return this.numer;
    }
    
    public int getDenominator() {
        return this.denom;
    }
    
    public Fraction get() {
        return this;
    }
    
    public Fraction simplify() {
        for(int i = 2; i <= numer ||  i <= denom;) {
            if(numer % i == 0 && denom % i == 0){
                numer = numer/i;
                denom = denom/i;
            } else i++;
        }
    return this;
    }

    public String toString() {
        return numer + "/" + denom;
    }


}
