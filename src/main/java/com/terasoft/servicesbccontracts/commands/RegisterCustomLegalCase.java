package com.terasoft.servicesbccontracts.commands;

import com.terasoft.common.domain.enums.MeetType;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterCustomLegalCase {
    @TargetAggregateIdentifier
    private String customLegalCaseId;
    private String title;
    private String startedAt;
    private String finishedAt;
    private MeetType meetType;
    private String linkZoom;
}
