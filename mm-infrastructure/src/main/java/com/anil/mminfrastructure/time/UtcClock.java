package com.anil.mminfrastructure.time;

import com.anil.mmabstractions.time.Clock;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class UtcClock implements Clock {
    @Override
    public ZonedDateTime currentDate() {
        return ZonedDateTime.now(ZoneOffset.UTC);
    }
}
