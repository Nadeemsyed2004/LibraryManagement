
public class User {
    private String id;
    private String name;
    private String ph_no;

    public User() {
    }

    public User(String id, String name, String ph_no) {
        this.id = id;
        this.name = name;
        this.ph_no = ph_no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

   
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + ph_no + '\''  +
                '}';
    }
}
