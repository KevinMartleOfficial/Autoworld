package be.vdab.util;

public class VolumeException extends Exception{
    private String omschrijving;

    public VolumeException(){}

    public VolumeException(String omschrijving){
        super(omschrijving);
    }
}
