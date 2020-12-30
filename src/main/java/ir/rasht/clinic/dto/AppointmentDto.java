package ir.rasht.clinic.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
public class AppointmentDto implements Serializable {
    private long id;

    private Instant startTime;

    private Instant finishTime;
}
