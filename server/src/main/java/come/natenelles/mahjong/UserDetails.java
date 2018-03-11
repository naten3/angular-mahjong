package come.natenelles.mahjong;

import java.util.Optional;
import java.util.UUID;

public class UserDetails {
    private Optional<String> name = Optional.empty();
    private Long id;

    public UserDetails(Long id) {
        this.id = id;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
