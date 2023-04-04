package com.dailycodebuffer.springsecuritydemo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client,Long> {

    Client findByUsername(String username);
}
