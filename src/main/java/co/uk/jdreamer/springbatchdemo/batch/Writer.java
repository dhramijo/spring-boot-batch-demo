package co.uk.jdreamer.springbatchdemo.batch;

import co.uk.jdreamer.springbatchdemo.models.User;
import co.uk.jdreamer.springbatchdemo.repositories.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Writer implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

        System.out.println("Data Saved for Users: " + users);
        userRepository.saveAll(users);

    }
}

