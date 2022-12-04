package com.core.libraries.common.models.notification;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class NotificationRequest {

    private NotificationHeader header;
    private List<String> to;
    private List<String> cc;
    private Map<String, Object> values;

}
