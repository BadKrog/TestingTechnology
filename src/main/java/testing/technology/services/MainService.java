package testing.technology.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.technology.database.entity.Data;
import testing.technology.database.jpa.DataRepository;

import java.util.Optional;

@Service
public class MainService {
    @Autowired
    private DataRepository dataRepository;

    public String checkDataById(Integer id){
        Optional<Data> data = dataRepository.findById(id);
        if (data.isPresent()){
            return data.get().getDataName();
        }
        return "Таких данных не существует";
    }
}
