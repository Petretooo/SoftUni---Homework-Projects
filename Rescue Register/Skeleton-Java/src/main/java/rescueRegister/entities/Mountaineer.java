package rescueRegister.entities;

import javax.persistence.*;

@Entity
@Table(name = "mountaineers")
public class Mountaineer {


    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private String lastSeenDate;

    Mountaineer(){

    }

    public Mountaineer(String name, Integer age, String gender, String lastSeenDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lastSeenDate = lastSeenDate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age", nullable = false)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name = "gender", nullable = false)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "lastSeenDate", nullable = false)
    public String getLastSeenDate() {
        return lastSeenDate;
    }

    public void setLastSeenDate(String lastSeenDate) {
        this.lastSeenDate = lastSeenDate;
    }
}
