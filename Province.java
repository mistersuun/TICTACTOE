/*
Souleymane Camara, 20142414
TP2
 */
package Province;


public class Province {
    private  String nomProvince;
    private  int populationProvince;
    private  Ville CapitaleVille;

    public static Ville GrandeVille;

    public  String getNomProvince() {
        return this.nomProvince;
    }

    public  void setNomProvince(String nomProvince) {
        this.nomProvince = nomProvince;
    }

    public  int getPopulationProvince() {
        return this.populationProvince;
    }

    public  void setPopulationProvince(int populationProvince) {
        this.populationProvince = populationProvince;
    }

    public  String getCapitalVilleNom() { return this.CapitaleVille.nomVille;
    }
    public  String getGrandeVilleNom() {
        return this. GrandeVille.nomVille;
    }

    public  void setCapitaleVilleNom(String value) {
        this. CapitaleVille.nomVille = value;
    }
    public  void setGrandeVilleNom(String value) { this.GrandeVille.nomVille= value;
    }



    public  int getCapitaleVillePopulation() {
        return this.CapitaleVille.villePopulation;
    }
    public  int getGrandeVillePopulation() {
        return  this.GrandeVille.villePopulation;
    }

    public  void setCapitaleVillePopulation(int value) {
        this. CapitaleVille.villePopulation = value;
    }
    public  void setGrandeVillePopulation(int value) {
        this. GrandeVille.villePopulation = value;
    }




    class Ville{
        public  int villePopulation;
        public  String nomVille;


    }

    public Province(String nomProvince, String nomCapitale , String GrandeVilleNom ,int populationProvince, int populationCapitale , int GrandeVillePopulation ) {
        this.nomProvince = nomProvince;
        this.populationProvince = populationProvince;
        this.CapitaleVille= this.new Ville();
        this. GrandeVille = this.new Ville();

        this.CapitaleVille.nomVille = nomCapitale;
        this.CapitaleVille.villePopulation = populationCapitale;

        this.GrandeVille.nomVille=GrandeVilleNom;
        this.GrandeVille.villePopulation=GrandeVillePopulation;


    }

}


