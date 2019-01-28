package domain;
import lombok.Data;

public @Data class EmployeeDTO {
	private String employeelId,
					manager,
					name,
					birthDate,
					photo,
					notes;
}
