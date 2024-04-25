package be.vdab.voertuigen.div;

public enum Div {
    INSTANCE;
    int teller = 1;

    Nummerplaat getNummerplaat(){
        StringBuilder builder = new StringBuilder();
        builder.append("1-AAA-") ;
        String tellerOmgezet = String.format("%3s", teller).replace(" ","0");
        builder.append(tellerOmgezet);
        teller++;
        if(teller == 999){
            teller = 1;
        }
        return new Nummerplaat(builder.toString());

    }
}
