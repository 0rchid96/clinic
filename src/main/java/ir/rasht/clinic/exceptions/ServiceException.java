package ir.rasht.clinic.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceException extends RuntimeException {
    private Integer status;
    private String message;
}
