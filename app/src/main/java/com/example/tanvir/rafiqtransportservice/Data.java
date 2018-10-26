package com.example.tanvir.rafiqtransportservice;

public class Data {

    String id;
    String date;
    String time;
    String transportName;
    String load;
    String unLoad;
    String rent;
    String advance;

public Data(String id, String date){

}

    public Data(String id, String date, String time, String transportName, String load, String unLoad, String rent, String advance) {
        id = id;
        this.date = date;
        this.time = time;
        this.transportName = transportName;
        this.load = load;
        this.unLoad = unLoad;
        this.rent = rent;
        this.advance = advance;
    }


    public String getDataid() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTransportName() {
        return transportName;
    }

    public String getLoad() {
        return load;
    }

    public String getUnLoad() {
        return unLoad;
    }

    public String getRent() {
        return rent;
    }

    public String getAdvance() {
        return advance;
    }
}
