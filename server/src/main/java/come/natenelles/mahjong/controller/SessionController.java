/*
 * Copyright 2014-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package come.natenelles.mahjong.controller;

import come.natenelles.mahjong.UserDetails;
import come.natenelles.mahjong.model.InitialSessionInfo;
import come.natenelles.mahjong.model.Room;
import come.natenelles.mahjong.model.SessionStatus;
import come.natenelles.mahjong.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class SessionController {

	@Autowired
	private RoomService roomService;

	@GetMapping("/init")
	public InitialSessionInfo getSession() {
		return new InitialSessionInfo("0");
	}

	@GetMapping("/session")
	public void setName(@RequestParam("name") String name, UserDetails userDetails) {
		userDetails.setName(Optional.of(name));
	}

	@GetMapping("/session/status")
	public SessionStatus getSessionStatus(UserDetails userDetails) {
		return new SessionStatus(
				roomService.getUserRoom(userDetails.getId()).map(Room::getId),
				userDetails.getName());
	}
}
