public class ADN {
    public static String devuelveComplementario(String adn){
        String adnComplementario="";
        int longitudCadenaADN=adn.length();

        for(int i=0;i<longitudCadenaADN;i++){
            char caracterADN=adn.charAt(i);
            if(caracterADN=='A'){
                adnComplementario+="T";
            }else if(caracterADN=='T'){
                adnComplementario+="A";
            } else if (caracterADN == 'G') {
                adnComplementario+="C";
            }else{
                adnComplementario+="G";
            }
        }
        return adnComplementario;
    }

    public static void main(String[] args) {
        System.out.println(ADN.devuelveComplementario("ATTGC"));
        System.out.println(ADN.devuelveComplementario("GTAT"));
    }
}
