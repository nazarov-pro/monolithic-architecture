package org.nazarovpro.monolithic.util.enums;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public interface Constants {

    interface DATE {
        String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);
        String DATE_PATTERN = "yyyy-MM-dd";
        DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
        String TIME_PATTERN = "HH:mm:ss";
        DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_PATTERN);

        String CARD_EXPIRE_DATE_PATTERN = "MM/yyyy";
        DateTimeFormatter CARD_EXPIRE_DATE_FORMATTER = DateTimeFormatter.ofPattern(CARD_EXPIRE_DATE_PATTERN);

        ZoneId UTC_ZONE = ZoneId.from(ZoneOffset.UTC);
        ZoneId GMT_PLUS_4_ZONE = ZoneId.from(ZoneOffset.of("+4"));
        ZoneId SERVER_ZONE = UTC_ZONE;
    }

}
