package testing.technology.services;

import org.springframework.stereotype.Service;
import testing.technology.database.entity.Simple;
import testing.technology.database.jpa.SimpleRepository;

import java.util.Optional;

@Service
public class MainService {
    private final SimpleRepository dataRepository;

    public MainService(SimpleRepository dataRepository){
        this.dataRepository = dataRepository;
    }

    public String checkDataById(Integer id){
        Optional<Simple> data = dataRepository.findById(id);
        if (data.isPresent()){
            return data.get().getName();
        }
        return "Таких данных не существует";
    }
}
