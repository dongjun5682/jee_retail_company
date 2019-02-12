package domain;
import lombok.Data;

public @Data class CustomerDTO {
	private String customerId,
					customerName,
					password,
					ssn,
					photo,
					phone,
					city,
					address,
					postalCode,
					rnum
					;
}
