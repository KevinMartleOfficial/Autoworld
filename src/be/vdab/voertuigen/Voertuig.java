package be.vdab.voertuigen;

import be.vdab.voertuigen.div.Nummerplaat;

import java.util.Objects;

public class Voertuig implements Comparable<Voertuig>{
    private final Nummerplaat nummerplaat;
    private String merk;
    private int aankoopprijs;

    public Voertuig(String merk, int aankoopprijs){
        setMerk(merk);
        setAankoopprijs(aankoopprijs);
        this.nummerplaat = getNummerplaat();
    }

    public Nummerplaat getNummerplaat() {
        return nummerplaat;
    }



    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        if(!merk.isBlank()) {
            this.merk = merk;
        }
    }

    public int getAankoopprijs() {
        return aankoopprijs;
    }

    public void setAankoopprijs(int aankoopprijs) {
        if (aankoopprijs>=0) {
            this.aankoopprijs = aankoopprijs;
        }
    }

    @Override
    public String toString() {
        return "Voertuig{" +
                "nummerplaat=" + nummerplaat +
                ", merk='" + merk + '\'' +
                ", aankoopprijs=" + aankoopprijs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voertuig voertuig)) return false;
        return nummerplaat == ((Voertuig) o).getNummerplaat();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummerplaat, merk, aankoopprijs);
    }

    @Override
    public int compareTo(Voertuig o) {
        return this.nummerplaat.compareTo(o.nummerplaat);
    }
}
