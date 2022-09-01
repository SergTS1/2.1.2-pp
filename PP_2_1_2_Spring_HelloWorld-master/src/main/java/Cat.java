import org.springframework.stereotype.Component;

import java.util.Objects;

public class Cat {
    private String cat;


    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat1 = (Cat) o;
        return Objects.equals(cat, cat1.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cat);
    }
}
