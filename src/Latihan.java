public class Latihan {
    private String nama;
    private String team;
    private int umur;
    private int penampilan;
    private int suara;
    private int atitude;
    private double nilai;
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getPenampilan() {
        return penampilan;
    }

    public void setPenampilan(int penampilan) {
        this.penampilan = penampilan;
    }

    public int getSuara() {
        return suara;
    }

    public void setSuara(int suara) {
        this.suara = suara;
    }

    public int getAtitude() {
        return atitude;
    }

    public void setAtitude(int atitude) {
        this.atitude = atitude;
    }

    public double getNilai() {
        return nilai = (suara + penampilan + atitude)/3;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

}
