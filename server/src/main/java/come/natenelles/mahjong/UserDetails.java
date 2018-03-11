package come.natenelles.mahjong;

import java.io.Serializable;

public class UserDetails implements Serializable{
    private final Long id;
    private final String name;

    public UserDetails(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
