
public class Staff {
    private String id;
    private String name;
    private String salary;
    private String ph_no;

    public Staff() {
    }

    public Staff(String id, String name,String salary,String ph_no) {
        this.id = id;
        this.name = name;
        this.salary = salary; 
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
    
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

   
    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", phone='" + ph_no + '\''  +
                '}';
    }
}