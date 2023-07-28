package Seminar3;

public class Employe {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employe(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + " - " + age; 
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Employe){
            Employe employe = (Employe) obj;
            if (name.equals(employe.name) && age == employe.age)
                return true;
        }
        return false;
    }
}
