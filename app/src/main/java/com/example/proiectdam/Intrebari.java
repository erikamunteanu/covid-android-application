package com.example.proiectdam;

public class Intrebari {
    public String vectIntreb[]={
        "V-ati deplasat in strainatate in ultimele 14 zile?",
        "Ati avut in ultimele 14 zile febra?",
        "Ati avut in ultimele 14 zile dificultate de a respira?",
        "Ati avut in ultimele 14 zile dureri musculare?",
        "Ati avut in ultimele 14 zile tuse intensa?",
        "Ati interactionat in ultimele 14 zile cu persoane care au avut simptome COVID-19?",
        "Ati avut in ultimele 14 zile dificultate de a respira?"
};
        public String vectRasp[][]={
                {"DA", "NU"}
        };
        public String raspCorecte[]={
                "DA"
        };
        public String getIntrebare(int i){
            return vectIntreb[i];
        }
        public String getRaspA(int i){
            return vectRasp[i][0];
        }
        public String getRaspB(int i){
            return vectRasp[i][1];
        }
        public String getRaspCorect(int i){
            return raspCorecte[i];
        }
}
