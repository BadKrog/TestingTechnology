package testing.technology.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import testing.technology.services.MainService;

@RestController
public class WebController {
    private static final Logger log = LoggerFactory.getLogger(WebController.class);
    private MainService mainService;

    public WebController(MainService mainService){
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "Hello, world!";
    }

    @GetMapping("/data")
    public String getData(@RequestParam("id") String id){
        try{
            Integer idInt = Integer.parseInt(id);
            return mainService.checkDataById(idInt);
        }catch (Exception e){
            log.error(e.getMessage());
            return "Вы ввели неправильный формат id";
        }
    }
}
