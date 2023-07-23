package com.example.reactivesprinbootcrudwithreactivemongodb.Controller;


import com.example.reactivesprinbootcrudwithreactivemongodb.Entity.User;
import com.example.reactivesprinbootcrudwithreactivemongodb.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class UserController {

     @Autowired
     private UserService userService;
    @GetMapping("/User/{id}")
    public Mono<User> getUserById(@PathVariable int id){
        return userService.getUserFromDbByID(id);


    }

    @GetMapping("/findAll")
    public Flux<User> findAll(){
        return userService.findAll();


    }

    @PutMapping("/User/{id}")
    public Mono<User> update(@PathVariable int id, @RequestBody User user){
        return userService.update(id,user);


    }

    @PostMapping("/insert")
    public Mono<User> insert( @RequestBody User user){
        return userService.insert(user);


    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable int id){
        return userService.delete(id);


    }
}
