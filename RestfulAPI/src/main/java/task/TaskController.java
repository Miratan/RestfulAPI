package task;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private TaskRepository repository;

	private static final Logger log = LoggerFactory.getLogger(TaskController.class);

	@RequestMapping("/save")
	@ResponseBody
	public String save(@Valid @RequestBody TaskDTO dto) {

		Task task = new Task(dto);
		try {
			repository.save(task);
		} catch (Exception e) {
			log.error(e.getMessage());
			return e.getMessage();
		}
		return task.toString();
	}

	@RequestMapping("/findOne/{id}")
	@ResponseBody
	public String findOne(@PathVariable("id") long id) {

		Task task;

		try {
			task = repository.findOne(id);
		} catch (Exception e) {
			log.error(e.getMessage());
			return e.getMessage();
		}

		if (task == null) {
			log.error("Nenhum registro encontrado com esses parâmetros");
			return "Nenhum registro encontrado com esses parâmetros ";
		}

		return task.toString();
	}

}
