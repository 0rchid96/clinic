package ir.rasht.clinic.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
public class ScheduleDto implements Serializable {
    private long scheduleId;

    private Instant startTime;

    private Instant finishTime;

}
