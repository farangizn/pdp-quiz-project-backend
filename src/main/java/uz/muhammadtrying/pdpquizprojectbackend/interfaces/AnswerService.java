package uz.muhammadtrying.pdpquizprojectbackend.interfaces;

import org.springframework.stereotype.Service;
import uz.muhammadtrying.pdpquizprojectbackend.entity.Answer;
import uz.muhammadtrying.pdpquizprojectbackend.entity.Option;

import java.util.List;
import java.util.Optional;

@Service
public interface AnswerService {
    void saveAll(List<Answer> answers);

    Optional<Answer> findByChosenOption(Option chosenOption);

    void save(Answer answer);
}
