package com.codehunter.countdowntimer.ca.core.port.out;

import com.codehunter.countdowntimer.ca.domain.User;

public interface ICreateUserPort {
    User createUser(User user);
}
