package com.terasoft.servicesbccontracts.events;

import com.terasoft.common.domain.enums.LawServiceState;
import lombok.Value;

@Value
public class LegalAdviceEdited {
    private String legalAdviceId;
    private LawServiceState state;
    private String title;
    private String description;
    private String legalResponse;
}
