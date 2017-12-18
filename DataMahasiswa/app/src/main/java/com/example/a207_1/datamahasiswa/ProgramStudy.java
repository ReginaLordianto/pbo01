package com.example.a207_1.datamahasiswa;

/**
 * Created by 207-1 on 27/11/2017.
 */

public class ProgramStudy {
    private String kode;
    private String nama;
    private String program;

    private String[][] data = new String[][]{
            {"55201","Sistem Informasi", "Sarjana"},
            {"57201","Informatika", "Sarjana"},
            {"55401","Sistem Informasi", "Diploma Tiga"},
            {"57401","Sistem Informasi", "Diploma Tiga"}
    };

    public ProgramStudy (String kode){
        this.kode= kode;
        this.carikode();
    }

    private void carikode() {
        for (int i=0;i<this.data.length;i++){
            if (this.kode.equals(data[i][0])){
                this.nama=this.data[i][1];
                this.program=this.data[i][2];
            }
        }
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return this.nama;
    }


    public String getProgram() {
        return this.program;
    }





}


