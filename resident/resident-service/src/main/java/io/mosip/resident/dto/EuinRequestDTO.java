package io.mosip.resident.dto;


import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.mosip.resident.constant.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EuinRequestDTO implements Serializable {
	private static final long serialVersionUID = -4492209826585681216L;
	@NotBlank(message = "transactionID should not be empty")
	@NotNull(message = "transactionID should not be null")
	private String transactionID;
	@NotBlank(message = "individualId should not be empty")
	@NotNull(message = "individualId should not be null")
	private String individualId;
	@NotNull(message = "individualIdType should not be null")
	@NotBlank(message = "individualIdType should not be empty")
	private String individualIdType;
	@NotBlank(message = "cardType should not be empty")
	@NotNull(message = "cardType should not be null")
	private String cardType;
	@NotBlank(message = "otp should not be empty")
	@NotNull(message = "otp should not be null")
	private String otp;
}
