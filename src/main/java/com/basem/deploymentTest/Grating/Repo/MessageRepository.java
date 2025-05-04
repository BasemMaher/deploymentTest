package com.basem.deploymentTest.Grating.Repo;

import com.basem.deploymentTest.Grating.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
    // findById(1) will work out of the box

}
