package michalski.kamil.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "first_name")
    private String name;
    @Column(name = "last_name")
    private String surname;
    @Column(name = "adress")
    private String adress;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    public Client() {
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
