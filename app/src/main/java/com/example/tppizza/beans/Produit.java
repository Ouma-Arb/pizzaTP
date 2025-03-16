package com.example.tppizza.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detailSingred;
    private String description;
    private String preparation;
    private static int count;
    public Produit(){}

    public Produit(String name, int i, int image, String s, String s1, String s2, String s3) {

        this.id = ++count;
        this.nom = name;
        this.nbrIngredients = i;
        this.photo = image;
        this.duree = s;
        this.detailSingred = s1;

        this.description = s2;
        this.preparation = s3;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetailSingred() {
        return detailSingred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetailSingred(String detailSingred) {
        this.detailSingred = detailSingred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }


}

