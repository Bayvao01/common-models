package com.core.libraries.common.models.notification;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NotificationHeader {

    private String applicationName;
    private String source;
    private String eventType;
}
