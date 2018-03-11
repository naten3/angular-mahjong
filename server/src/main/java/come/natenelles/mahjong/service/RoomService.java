package come.natenelles.mahjong.service;

import come.natenelles.mahjong.model.Room;

import java.util.Optional;

public interface RoomService {
    public Optional<Room> getUserRoom(long userId);
}
