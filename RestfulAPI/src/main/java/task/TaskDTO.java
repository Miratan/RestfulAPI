package task;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TaskDTO {

	@NotNull
    @Size(min = 2, max = 100)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
