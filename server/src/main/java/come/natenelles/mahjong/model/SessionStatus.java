package come.natenelles.mahjong.model;

import java.util.Optional;

public class SessionStatus {
    Optional<Long> roomId;
    Optional<String> name;

    public SessionStatus(Optional<Long> roomId, Optional<String> name) {
        this.roomId = roomId;
        this.name = name;
    }

    public Optional<Long> getRoomId() {
        return roomId;
    }

    public Optional<String> getName() {
        return name;
    }
}
