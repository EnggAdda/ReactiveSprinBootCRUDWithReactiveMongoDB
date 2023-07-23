package com.example.reactivesprinbootcrudwithreactivemongodb.Repo;

import com.example.reactivesprinbootcrudwithreactivemongodb.Entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepo extends ReactiveMongoRepository<User, Integer> {
}
