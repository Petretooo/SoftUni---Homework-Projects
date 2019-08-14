package rescueRegister.controllers;

import rescueRegister.bindingModels.MountaineerBindingModel;
import rescueRegister.entities.Mountaineer;
import rescueRegister.repositories.MountaineerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MountaineerController {
    private final MountaineerRepository mountaineerRepository;

    @Autowired
    public MountaineerController(MountaineerRepository mountaineerRepository) {
        this.mountaineerRepository = mountaineerRepository;
    }


    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {

        List<Mountaineer> mountaineers = this.mountaineerRepository.findAll();

        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view","mountaineer/Index");
        modelAndView.addObject("mountaineers",mountaineers);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(ModelAndView modelAndView) {
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view","mountaineer/Create");
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(Mountaineer mountaineer) {
        this.mountaineerRepository.saveAndFlush(mountaineer);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(value = "id") Integer id, ModelAndView modelAndView) {
        Mountaineer mountaineer = this.mountaineerRepository.findById(id).get();
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view","mountaineer/Edit");
        modelAndView.addObject("mountaineer",mountaineer);
        return modelAndView;
    }

    @PostMapping("edit/{id}")
    public String edit(@PathVariable(value = "id") Integer id, MountaineerBindingModel bookBindingModel) {
        Mountaineer mountaineer = this.mountaineerRepository.findById(id).get();
        mountaineer.setAge(bookBindingModel.getAge());
        mountaineer.setGender(bookBindingModel.getGender());
        mountaineer.setLastSeenDate(bookBindingModel.getLastSeenDate());
        mountaineer.setName(bookBindingModel.getName());
        this.mountaineerRepository.saveAndFlush(mountaineer);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView remove(@PathVariable(value = "id") Integer id, ModelAndView modelAndView) {
        Mountaineer mountaineer = this.mountaineerRepository.findById(id).get();
        modelAndView.setViewName("base-layout");
        modelAndView.addObject("view","mountaineer/Remove");
        modelAndView.addObject("mountaineer",mountaineer);
        return modelAndView;
    }

    @PostMapping("/delete/{id}")
    public String remove(Mountaineer mountaineer) {
        this.mountaineerRepository.delete(mountaineer);
        return "redirect:/";
    }
}
