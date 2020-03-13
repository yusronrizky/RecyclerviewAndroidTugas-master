package id.ac.polinema.recyclerview.models;

public class ExerciseModel {
    private String title, nama;
    private int logo;

    public ExerciseModel(String title, String nama, int logo) {
        this.title = title;
        this.nama = nama;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public String getNama() {
        return nama;
    }

    public int getLogo() {
        return logo;
    }
}
