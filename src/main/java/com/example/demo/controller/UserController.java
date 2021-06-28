package com.example.demo.controller;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class UserController {
@GetMapping
public ModelAndView userhome()
{
ModelAndView mv=new ModelAndView("User.html");
return mv;

}
@PostMapping
public String result(@RequestParam int id,String nom,String prenom,int age)
{
User us=new User(id, age, nom, prenom);
return us.toString();
}
}
