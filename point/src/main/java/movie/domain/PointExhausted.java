package movie.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import movie.domain.*;
import movie.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointExhausted extends AbstractEvent {

    private Long id;

    public PointExhausted(Point aggregate) {
        super(aggregate);
    }

    public PointExhausted() {
        super();
    }
}
//>>> DDD / Domain Event
