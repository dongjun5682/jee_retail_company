package domain;
import lombok.Data;

public @Data class CustomerDTO {
	private String customerId,
					customerName,
					contactName,
					address,
					city,
					postalCode,
					country;
}
