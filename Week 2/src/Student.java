public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;


    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String n)
    {
        this.id = n;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String n)
    {
        this.group = n;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String n)
    {
        this.email = n;
    }

    /**
     * Constructor 1
     */

    public String getInfo()
    {
        return name + " - " + id + " - " + group + " - " + email;
    }

    Student()
    {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    Student(String name, String id, String email)
    {
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    Student(Student s)
    {
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
    }
}