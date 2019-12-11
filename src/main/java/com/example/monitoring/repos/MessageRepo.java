package com.example.monitoring.repos;

import org.springframework.data.repository.CrudRepository;
import com.example.monitoring.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
