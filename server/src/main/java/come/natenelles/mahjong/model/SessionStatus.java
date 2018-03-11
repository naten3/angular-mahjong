package come.natenelles.mahjong.model;

import java.util.Optional;

public class SessionStatus {
    Optional<Long> roomId;
    String name;

    public SessionStatus(Optional<Long> roomId, String name) {
        this.roomId = roomId;
        this.name = name;
    }

    public Optional<Long> getRoomId() {
        return roomId;
    }

    public String getName() {
        return name;
    }
}
