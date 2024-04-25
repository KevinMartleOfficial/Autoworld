package be.vdab.voertuigen.div;

import java.util.Objects;

public class Nummerplaat implements Comparable<Nummerplaat> {

    private String plaat;

    public Nummerplaat(String plaat){
        this.plaat = plaat;
    }

    public String getPlaat() {
        return plaat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nummerplaat that)) return false;
        return plaat ==((Nummerplaat) o).plaat;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(plaat);
    }

    @Override
    public String toString(){
        return "De nummerplaats is :"+ getPlaat();
    }

    @Override
    public int compareTo(Nummerplaat nummerplaat) {
        return this.plaat.compareTo(plaat);
    }


}
