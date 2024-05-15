package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class CarService {
    private static final List<Car> LIST = new ArrayList<>() {{
        add(new Car(2018, "bmw", 5));
        add(new Car(2014, "volkswagen", 2));
        add(new Car(2015, "mercedes", 6));
        add(new Car(2018, "audi", 7));
        add(new Car(1989, "ferari", 7));
    }};

    /**
     * @param count is an integer value from request
     * @return empty list, if count < 2; full car LIST, if count is absent; else list with the specified quantity (по усл. задачи)
     */
    public List<Car> getCars(Integer count) {
        if (Objects.isNull(count)) {
            return new ArrayList<>(LIST);
        }

        if (count < 2) {
            return new ArrayList<>(Collections.emptyList());
        }

        return LIST.stream()
                .limit(count)
                .toList();
    }
}
