package de.neuefische.springexceptionhandlingtask;

import jdk.jfr.Timestamp;

@Timestamp
public record ErrorMessage(
        String errorMessage
) {

}
