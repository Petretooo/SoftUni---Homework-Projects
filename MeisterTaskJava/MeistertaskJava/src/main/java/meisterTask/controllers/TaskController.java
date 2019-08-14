package meisterTask.controllers;

import meisterTask.bindingModel.TaskBindingModel;
import meisterTask.entities.Task;
import meisterTask.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TaskController {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    //1.Можем да го направим с Model model, вместо ModelandView
    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {

        //Първи начин
        /*List<Task> openTasks = this.taskRepository
                .findAll()
                .stream()
                .filter(e -> e.getStatus().equals("Open"))
                .collect(Collectors.toList());
        List<Task> inProgessTasks = this.taskRepository
                .findAll()
                .stream()
                .filter(e -> e.getStatus().equals("In Progress"))
                .collect(Collectors.toList());
        List<Task> fnishedTasks = this.taskRepository
                .findAll()
                .stream()
                .filter(e -> e.getStatus().equals("Finished"))
                .collect(Collectors.toList());*/

        //Втори начин
        List<Task> openTasks = this.taskRepository.findAllByStatus("Open");
        List<Task> inProgessTasks = this.taskRepository.findAllByStatus("In Progress");
        List<Task> finishedTasks = this.taskRepository.findAllByStatus("Finished");

        /*1.
            model.addAtribute("view", "task/index");
            model.addAtribute("openTasks", openTasks);
            model.addAtribute("inProgressTasks", inProgressTasks);
            model.addAtribute("finishedTasks", finishedTasks);

            return "base-layout";
         */

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/index");
        modelAndView.addObject("openTasks",openTasks);
        modelAndView.addObject("inProgressTasks",inProgessTasks);
        modelAndView.addObject("finishedTasks",finishedTasks);

        //TODO
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/create");
        return modelAndView;

        //TODO
        }

    @PostMapping("/create")
    public String create(TaskBindingModel taskBindingModel) {
        Task task = new Task(taskBindingModel.getTitle(),taskBindingModel.getStatus());
        this.taskRepository.saveAndFlush(task);
        return "redirect:/";
        //TODO
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {

        Task task = this.taskRepository.findById(id).get();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/edit");
        modelAndView.addObject("task",task);
        //TODO

        return modelAndView;
    }

    @PostMapping("/edit/{id}")
    public String edit(TaskBindingModel taskBindingModel,
                       @PathVariable(value = "id") Integer id) {
        Task task = this.taskRepository.findById(id).get();

        task.setTitle(taskBindingModel.getTitle());
        task.setStatus(taskBindingModel.getStatus());

        this.taskRepository.saveAndFlush(task);
        return "redirect:/";

       //TODO
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(ModelAndView modelAndView,
                             @PathVariable(value = "id") Integer id) {
        Task task = this.taskRepository.findById(id).get();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view", "task/delete");
        modelAndView.addObject("task",task);
        //TODO

        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public String delete(Task task) {
        //Ако не ни се подават Task task
        // Task task = this.taskRepository.getOne(id);
        this.taskRepository.delete(task);
       //TODO

        return "redirect:/";
    }
}
