package pojo;

public class test01 {
    String acc;
    String pwd;
    String name;
    String phone;
    public test01(){}
    public test01(String acc,String pwd,String name,String phone){
        this.acc=acc;
        this.pwd=pwd;
        this.name=name;
        this.phone=phone;
    }
    public test01(String acc){
        this.acc=acc;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "test01{" +
                "acc='" + acc + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
