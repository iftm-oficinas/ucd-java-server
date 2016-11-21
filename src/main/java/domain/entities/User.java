package domain.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user", schema = "ucd")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @Column(unique = true)
    private String email;

    @NotNull
    private String password;

    @NotNull
    private Byte inspector;

    @NotNull
    private Byte score;

    public User() {
        // Default constructor.
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String name, String email, String password, Byte inspector, Byte score) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.inspector = inspector;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getInspector() {
        return inspector;
    }

    public void setInspector(Byte inspector) {
        this.inspector = inspector;
    }

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id + ", " +
                "name:'" + name + ", " +
                "email:'" + email + ", " +
                "password:'" + password + ", " +
                "inspector:" + inspector + ", " +
                "score:" + score + "}";
    }
}
