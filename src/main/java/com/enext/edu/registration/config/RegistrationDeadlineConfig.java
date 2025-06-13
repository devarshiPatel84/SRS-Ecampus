package com.enext.edu.registration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class RegistrationDeadlineConfig {

    @Value("${registration.deadline.start}")
    private String start;

    @Value("${registration.deadline.end}")
    private String end;

    public LocalDate getStartDate() {
        return LocalDate.parse(start);
    }

    public LocalDate getEndDate() {
        return LocalDate.parse(end);
    }

    public boolean isWithinDeadline() {
        LocalDate today = LocalDate.now();
        return (today.isEqual(getStartDate()) || today.isAfter(getStartDate()))
                && (today.isEqual(getEndDate()) || today.isBefore(getEndDate()));
    }
}