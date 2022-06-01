package com.terasoft.servicesbccontracts.events;

import com.terasoft.common.domain.enums.LawServiceState;
import com.terasoft.common.domain.enums.MeetType;
import lombok.Value;

@Value
public class CustomLegalCaseEdited {
    private String customLegalCaseId;
    private LawServiceState state;
    private String title;
    private String startedAt;
    private String finishedAt;
    private MeetType meetType;
    private String linkZoom;
}
