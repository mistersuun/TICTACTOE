/*
Souleymane Camara, 20142414
TP2
 */

package Province;

public class TestProvince {
    public static void main(String[] args) {

        Province p2 = new Province("Colombie Britannique","Victoria","Vancouver",4648055 ,85792,631486);
        Province p1 = new Province("Alberta","Edmonton","Calgary",4067175,1321426,1285711);

        Province p3= new Province("Manitoba","Winnipeg","Winnipeg",1278365,727500,727500);
        Province p4 = new Province("Nouveau-Brunswick","Fredericton","Moncton",747101,56224,71889);
        Province p5 = new Province("Terre-Neuve-et-Labrador","Saint-Jean de Terre-Neuve","Saint-Jean de Terre-Neuve",519716,108860,108860);
        Province p6 = new Province("Territoires du Nord-Ouest","Yellowknife","Yellowknife",41786,19569,19569);
        Province p7 = new Province("Nouvelle-Ecosse","Halifax","Halifax",923598,413700,413700);
        Province p8 = new Province("Nunavut","Iqaluit","Iqaluit",35994,7740,7740);
        Province p9 = new Province("Ontario","Toronto","Ottawa",1076395,2956024,2956024);
        Province p10 = new Province("Ile du prince Edouard","Charlottetown","Charlottetown",142907,36094,36094);


        Province p11 = new Province("Quebec","Quebec ","Montreal",8164361,531902,1704694);
        Province p12 = new Province("Saskatchewan","Regina","Saskatoon",651036,193100,246376);
        Province p13 = new Province("Yukon Territory","Whitehorse","Whitehorse",35874,25085,25085);

        System.out.println("Nom de Province :" + p1.getNomProvince() + "  , Population  :" + p1.getPopulationProvince() +" , Capitale :" + p1.getCapitalVilleNom() +
                " , Population de la capitale : "+p1.getCapitaleVillePopulation() + "   , Nom de la plus grande capitale :  "+ p1.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p1.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p2.getNomProvince() + "  , Population  :" + p2.getPopulationProvince() +" , Capitale :" + p2.getCapitalVilleNom() +
                " , Population de la capitale : "+p2.getCapitaleVillePopulation() + "  , Nom de la plus grande capitale :  "+ p2.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p2.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p3.getNomProvince() + "  , Population  :" + p3.getPopulationProvince() +" , Capitale :" + p3.getCapitalVilleNom() +
                " , Population de la capitale : "+p3.getCapitaleVillePopulation() + "      , Nom de la plus grande capitale :  "+ p3.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p3.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p4.getNomProvince() + "  , Population  :" + p4.getPopulationProvince() +" , Capitale :" + p5.getCapitalVilleNom() +
                " , Population de la capitale : "+p4.getCapitaleVillePopulation() + "      , Nom de la plus grande capitale :  "+ p4.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p5.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p5.getNomProvince() + "  , Population  :" + p5.getPopulationProvince() +" , Capitale :" + p5.getCapitalVilleNom() +
                " , Population de la capitale : "+p5.getCapitaleVillePopulation() + "     , Nom de la plus grande capitale :  "+ p5.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p5.getGrandeVillePopulation());


        System.out.println("Nom de Province :" + p6.getNomProvince() + "  , Population  :"  + p6.getPopulationProvince() +" , Capitale :"         + p6.getCapitalVilleNom() +
                " , Population de la capitale : "+p6.getCapitaleVillePopulation()+"     , Nom de la plus grande capitale :  "+ p6.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p6.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p7.getNomProvince() + "  , Population  :"  + p7.getPopulationProvince() +" , Capitale :"         + p7.getCapitalVilleNom() +
                " , Population de la capitale : "+p7.getCapitaleVillePopulation()+"    , Nom de la plus grande capitale :  "+ p7.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p7.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p8.getNomProvince() + "  , Population  :"  + p8.getPopulationProvince() +" , Capitale :"         + p8.getCapitalVilleNom() +
                " , Population de la capitale : "+p8.getCapitaleVillePopulation()+"   , Nom de la plus grande capitale :  "+ p8.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p8.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p9.getNomProvince() + "  , Population  :"  + p9.getPopulationProvince() +" , Capitale :"         + p9.getCapitalVilleNom() +
                " , Population de la capitale : "+p9.getCapitaleVillePopulation()+"    , Nom de la plus grande capitale :  "+ p9.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p9.getGrandeVillePopulation());
        System.out.println("Nom de Province :" + p10.getNomProvince() + "  , Population  :"  + p10.getPopulationProvince() +" , Capitale :"         + p10.getCapitalVilleNom() +
                " , Population de la capitale : "+p10.getCapitaleVillePopulation()+"    , Nom de la plus grande capitale :  "+ p10.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p10.getGrandeVillePopulation());

        System.out.println("Nom de Province :" + p11.getNomProvince() + "  , Population  :"  + p11.getPopulationProvince() +" , Capitale :"         + p11.getCapitalVilleNom() +
                " , Population de la capitale : "+p11.getCapitaleVillePopulation()+", Nom de la plus grande capitale :  "+ p11.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p11.getGrandeVillePopulation());
        System.out.println("Nom de Province :" + p12.getNomProvince() + "  , Population  :"  + p12.getPopulationProvince() +" , Capitale :"         + p12.getCapitalVilleNom() +
                " , Population de la capitale : "+p12.getCapitaleVillePopulation()+", Nom de la plus grande capitale :  "+ p12.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p12.getGrandeVillePopulation());
        System.out.println("Nom de Province :" + p13.getNomProvince() + "  , Population  :"  + p13.getPopulationProvince() +" , Capitale :"         + p13.getCapitalVilleNom() +
                " , Population de la capitale : "+p13.getCapitaleVillePopulation()+", Nom de la plus grande capitale :  "+ p13.getGrandeVilleNom()+  " , Population de la plus grande ville : " +p13.getGrandeVillePopulation());


    }

}

/*
Execution

Nom de Province :Alberta  , Population  :4067175 , Capitale :Edmonton , Population de la capitale : 1321426   , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Colombie Britannique  , Population  :4648055 , Capitale :Victoria , Population de la capitale : 85792  , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Manitoba  , Population  :1278365 , Capitale :Winnipeg , Population de la capitale : 727500      , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Nouveau-Brunswick  , Population  :747101 , Capitale :Saint-Jean de Terre-Neuve , Population de la capitale : 56224      , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Terre-Neuve-et-Labrador  , Population  :519716 , Capitale :Saint-Jean de Terre-Neuve , Population de la capitale : 108860     , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Territoires du Nord-Ouest  , Population  :41786 , Capitale :Yellowknife , Population de la capitale : 19569     , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Nouvelle-Ecosse  , Population  :923598 , Capitale :Halifax , Population de la capitale : 413700    , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Nunavut  , Population  :35994 , Capitale :Iqaluit , Population de la capitale : 7740   , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Ontario  , Population  :1076395 , Capitale :Toronto , Population de la capitale : 2956024    , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Ile du prince Edouard  , Population  :142907 , Capitale :Charlottetown , Population de la capitale : 36094    , Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Quebec  , Population  :8164361 , Capitale :Quebec  , Population de la capitale : 531902, Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Saskatchewan  , Population  :651036 , Capitale :Regina , Population de la capitale : 193100, Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085
Nom de Province :Yukon Territory  , Population  :35874 , Capitale :Whitehorse , Population de la capitale : 25085, Nom de la plus grande capitale :  Whitehorse , Population de la plus grande ville : 25085

Process finished with exit code 0
 */
