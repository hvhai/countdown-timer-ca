package com.codehunter.countdowntimer.ca.core.service.event;

import com.codehunter.countdowntimer.ca.core.port.in.event.IDeleteEventUseCase;
import com.codehunter.countdowntimer.ca.core.port.out.event.IDeleteEventPort;
import com.codehunter.countdowntimer.ca.core.port.out.event.IHasEventPort;
import com.codehunter.countdowntimer.ca.persistence.UseCase;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@RequiredArgsConstructor
@Transactional
public class DeleteEventService implements IDeleteEventUseCase {
    private final IDeleteEventPort deleteEventPort;
    private final IHasEventPort hasEventPort;

    @Override
    public String deleteEvent(DeleteEventIn deleteEventIn) {
        if (hasEventPort.hasEvent(deleteEventIn.getEventId())) {
            deleteEventPort.deleteEvent(deleteEventIn.getEventId());
            return DELETE_EVENT_SUCCESS;
        }
        return DELETE_EVENT_NOT_EXIST;
    }
}