package com.terasoft.servicesbccontracts.commands;

import com.terasoft.common.domain.enums.LawServiceState;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class EditLegalAdvice {
    @TargetAggregateIdentifier
    private String legalAdviceId;
    private LawServiceState state;
    private String title;
    private String description;
    private String legalResponse;
}
