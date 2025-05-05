package oop_2.agregation;

import java.util.ArrayList;
import java.util.List;

public class Departament {
    private List<Teachers> teachers;

    Departament(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public static void main(String[] args) {
        List<Teachers> teachers = new ArrayList<>();
        teachers.add(new Teachers("Avet"));
        teachers.add(new Teachers("Jack"));

        Departament departament = new Departament(teachers);

        for (Teachers teachers1 : departament.getTeachers())
            System.out.println(teachers1.getName());

    }
}

class Teachers {
    private String name;

    Teachers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
