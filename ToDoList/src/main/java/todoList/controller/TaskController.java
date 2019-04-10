package todoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import todoList.bindingModel.TaskBindingModel;
import todoList.entity.Task;
import todoList.repository.TaskRespository;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class TaskController {

    private final TaskRespository taskRespository;

    @Autowired
    public TaskController(TaskRespository taskRespository) {
        this.taskRespository = taskRespository;
    }

    @GetMapping("/")
    public String index(Model model){
        List<TaskBindingModel> tasks = this.taskRespository.findAll()
                .stream()
                .map(t -> new TaskBindingModel(t.getId(),t.getTitle(),t.getComments()))
                .collect(Collectors.toList());
        model.addAttribute("tasks", tasks);
        model.addAttribute("view","/task/index");
        return "";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("view","task/create");
        return "base-layout";
    }

    @PostMapping("/create")
    public String create(Task task, Model model){
        model.addAttribute("view","task/create");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id, Model model){
        Task t= this.taskRespository.findAllById(id).get();
        TaskBindingModel taskBindingModel = new TaskBindingModel(t.getId(),
                t.getTitle(),t.getComments());
        model.addAttribute("task",taskBindingModel);
        model.addAttribute("view","task/edit");
        return "base-layout";
    }


    @PostMapping("/edit/{id}")
    public String edit(@PathVariable( value = "id") Integer id, TaskBindingModel model){
        Task t = this.taskRespository.findAllById(id).get();
        t.setComments(model.getComments());
        t.setTitle(model.getTitle());
        this.taskRespository.saveAndFlush(t);
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String delete(Model model, @PathVariable("id") Integer id){
        Task t = this.taskRespository.findAllById(id).get();
        TaskBindingModel taskBindingModel = new TaskBindingModel(t.getId(),
                t.getTitle(),t.getComments());
        model.addAttribute("task",taskBindingModel);
        model.addAttribute("view","task/edit");

        return "base-layout";
    }


    @PostMapping("id")
    public String delete(@PathVariable("id")Integer id){
        this.taskRespository.deleteById(id);
        return "redirect:/";
    }
}
