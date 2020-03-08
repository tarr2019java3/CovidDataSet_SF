package pl.sda.covid_dataset;

public class Record {
    private int sno;
    private String date;
    private String province;
    private String country;
    private String lastUpdate;
    private double confirmed;
    private double deaths;
    private  double recovered;

    public Record() {
    }

    public Record(int sno, String date, String prowince, String country, String lastUpdate,
                  double confirmed, double deaths, double recovered) {
        this.sno = sno;
        this.date = date;
        this.province = province;
        this.country = country;
        this.lastUpdate = lastUpdate;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProwince() {
        return province;
    }

    public void setProwince(String prowince) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public double getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(double confirmed) {
        this.confirmed = confirmed;
    }

    public double getDeaths() {
        return deaths;
    }

    public void setDeaths(double deaths) {
        this.deaths = deaths;
    }

    public double getRecovered() {
        return recovered;
    }

    public void setRecovered(double recovered) {
        this.recovered = recovered;
    }
}
