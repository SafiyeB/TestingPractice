package Practice_folder.jdbcPackage;

public class HotelsPojo {

    private int idHotel;
    private String name;
    private int code;

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

 @Override
    public String toString(){
        return "id: "+ idHotel + "Name: " + name + "Code :"+code;

 }

 public HotelsPojo(int id, String Name, int Code){
        this.idHotel=id;
        this.code=Code;
        this.name=Name;


 }

    public HotelsPojo() {
    }
}
