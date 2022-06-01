package com.terasoft.servicesbccontracts.events;

import lombok.Value;

@Value
public class LegalAdviceRegistered {
    private String legalAdviceId;
    private String title;
    private String description;
}
