package com.codehunter.countdowntimer.ca.core.port.out;

import java.util.List;
import com.codehunter.countdowntimer.ca.domain.Event;
import com.codehunter.countdowntimer.ca.domain.User;

public interface IGetAllEventPort {
    List<Event> getAllEvents();
    List<Event> getAllEventsWithUser(User user);

}
