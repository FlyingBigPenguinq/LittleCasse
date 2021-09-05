package Stream_model;

import java.io.Serializable;

public class Ser_model implements Serializable {
    private static final long serialVersionUID = 2331734698766283549L;
    private String name = "ds";
    private Integer age = 55;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
