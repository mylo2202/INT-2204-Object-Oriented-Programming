public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)
    private Student[] students = new Student[100];
    private int numStudent = 0;
    private Group[] groups = new Group[100];
    private int numGroup = 0;

    public class Group {
        private String name;
        private String result;

        public Group (String name) {
            this.name = name;
            this.result = name + "\n";
        }

        public void addStudent (Student s)
        {
            this.result += s.getInfo() + "\n";
        }

        public String print()
        {
            return result;
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().compareTo(s2.getGroup()) == 0;
    }

    private void addToGroup(Student s)
    {
        for (int i = 0 ; i < numGroup ; i++)
            if (s.getGroup().compareTo(groups[i].name) == 0)
            {
                groups[i].addStudent(s);
                return;
            }
        groups[numGroup] = new Group(s.getGroup());
        groups[numGroup].addStudent(s);
        numGroup++;
    }

    public void addStudent(Student newStudent){
        // TODO:
        students[numStudent] =  new Student(newStudent);
        numStudent++;
    }

    public String studentsByGroup() {
        // TODO:
        numGroup = 0;
        for (int i = 0 ; i < numStudent ; i++) addToGroup(students[i]);
        String res = "";
        for (int i = 0 ; i < numGroup ; i++) res += groups[i].print();
        return res;
    }

    public void removeStudent(String id) {
        // TODO:
        for (int i = 0 ; i < numStudent ; i++)
            if (students[i].getId().compareTo(id) == 0)
            {
                for (int j = i; j < numStudent - 1; j++)
                    students[j] = students[j + 1];
                students[numStudent - 1] = null;
                numStudent--;
            }
    }
}