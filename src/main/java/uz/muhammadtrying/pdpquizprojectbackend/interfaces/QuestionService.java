package uz.muhammadtrying.pdpquizprojectbackend.interfaces;

import org.springframework.stereotype.Service;
import uz.muhammadtrying.pdpquizprojectbackend.entity.Question;

@Service
public interface QuestionService {
    void save(Question question);
}
