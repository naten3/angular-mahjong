package come.natenelles.mahjong.service.impl;

import come.natenelles.mahjong.model.Room;
import come.natenelles.mahjong.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RoomServiceImpl implements RoomService {
    Map<Long, Room> userRooms = new ConcurrentHashMap();

    @Override
    public Optional<Room> getUserRoom(long userId) {
        return Optional.ofNullable(userRooms.get(userId));
    }
}
