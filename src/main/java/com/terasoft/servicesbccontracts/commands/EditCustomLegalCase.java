package com.terasoft.servicesbccontracts.commands;

import com.terasoft.common.domain.enums.LawServiceState;
import com.terasoft.common.domain.enums.MeetType;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditCustomLegalCase {
    @TargetAggregateIdentifier
    private String customLegalCaseId;
    private LawServiceState state;
    private String title;
    private String startedAt;
    private String finishedAt;
    private MeetType meetType;
    private String linkZoom;

}
