package be.vdab.util;

import java.util.Objects;

public final class Volume implements Comparable<Volume>{
    private final int breedte;
    private final int hoogte;
    private final int diepte;
    private final Maat maat;

    public Volume(int breedte, int hoogte, int diepte, Maat maat){
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.diepte = diepte;
        this.maat = maat;

    }

    public int getBreedte() {
        return breedte;
    }

    public int getHoogte() {
        return hoogte;
    }

    public int getDiepte() {
        return diepte;
    }

    public Maat getMaat() {
        return maat;
    }

    public long getVolume(){
        long volume = 0;

        try{
            volume = breedte * hoogte * diepte;
            if(volume<0){
                throw new VolumeException("Ongeldig volume");

        }

        } catch (VolumeException e) {
            System.out.println(e.getMessage());

        }

        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume volume)) return false;
        return breedte == volume.breedte && hoogte == volume.hoogte && diepte == volume.diepte && maat == volume.maat;
    }


    @Override
    public int compareTo(Volume o) {
        if(this.getVolume()>o.getVolume())
        return 1;
    }
}
