package softuni.gamestore.entity;

import javax.persistence.*;

@Entity
@Table(name = "games")
public class Game {
    private Integer id;
    private String name;
    private String dlc;
    private Double price;
    private String platform;

    Game(){

    }

    public Game(String name, String dlc, Double price, String platform) {
        this.name = name;
        this.dlc = dlc;
        this.price = price;
        this.platform = platform;
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

    @Column(name = "dlc", nullable = false)
    public String getDlc() {
        return dlc;
    }

    public void setDlc(String dlc) {
        this.dlc = dlc;
    }

    @Column(name = "price", nullable = false)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "platform", nullable = false)
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
