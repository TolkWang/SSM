package cn.wt.domain;

public class Home {

    private Integer id;
    private String homename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHomename() {
        return homename;
    }

    public void setHomename(String homename) {
        this.homename = homename;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", homename='" + homename + '\'' +
                '}';
    }
}
