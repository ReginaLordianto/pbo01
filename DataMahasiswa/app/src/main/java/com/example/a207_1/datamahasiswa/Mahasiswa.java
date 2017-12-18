package com.example.a207_1.datamahasiswa;

/**
 * Created by 207-1 on 20/11/2017.
 */

public class Mahasiswa {

        private String nama;
        private String nim;
        private String email;
        private String lkpr;
        private String kode;
        private ProgramStudy prodi;

    private String[][] data= new String[][]{
            {"51015003","Aprianto","lk","aprianto_16@kharisma.ac.id","55201"},
            {"51015004","Billy Tanyawan","lk","billttanyawan_16@kharisma.ac.id","57201"},
            {"51015008","Florencia Irena","pr","florenciairena_16@kharisma.ac.id","55201"},
            {"51015011","Jessica Chandra","pr","jessicachandra_16@kharisma.ac.id","55201"},
            {"51015016","Winny Claudia","pr","winnyclaudia_16@kharisma.ac.id","57201"},
    };

    public Mahasiswa(String nim) {
        this.nim=nim;
        this.cariNim();
    }

   public void setNim(String nim){
       this.nim=nim;
        this.cariNim();
    }



    public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNim() {
            return nim;
        }


        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLkpr() {
            return lkpr;
        }

        public void setLkpr(String lkpr) {
            this.lkpr = lkpr;
        }


        public String getKode() {
        return kode;
        }

         public void setKode(String kode) {
        this.kode = kode;
        }

        public ProgramStudy getProdi() {
        return this.prodi;
        }


    private void cariNim(){

        for (int i=0;i<this.data.length;i++) {
            if (this.nim.equals(this.data[i][0])){
                this.nama=this.data[i][1];
                this.lkpr=this.data[i][2];
                this.email=this.data[i][3];
                this.kode = this.data [i][4];
                this.prodi=new ProgramStudy(this.kode);
            }
        }
    }
}


