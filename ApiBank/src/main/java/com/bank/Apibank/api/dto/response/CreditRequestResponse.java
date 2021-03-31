package com.bank.Apibank.api.dto.response;

import com.bank.Apibank.domain.Requester;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
public class CreditRequestResponse {
    String value;
    String token;
}