package eva.springframework.joke.jokeapp.controllers;

import eva.springframework.joke.jokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class JokeController {

    private String joke;
    private  JokeService jokeService;


    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        joke =  jokeService.makeJoke();
        model.addAttribute("joke", joke);
        return "/funny";
    }

}
