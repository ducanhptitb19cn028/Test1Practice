package dajava.pro.test1practice.model;

public class HouseWork {
    private int id;
    private String name;
    private String des;
    private String gender;
    private String finish_date;

    public HouseWork() {
    }

    public HouseWork(int id, String name, String des, String gender, String finish_date) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.gender = gender;
        this.finish_date = finish_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(String finish_date) {
        this.finish_date = finish_date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
