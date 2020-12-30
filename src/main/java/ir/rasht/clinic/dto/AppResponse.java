package ir.rasht.clinic.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class AppResponse<T> implements Serializable {
    private Integer status = 0;
    private String message = "OK";
    private T body;
    private Long currentTime = new Date().getTime();

    public AppResponse(T body) {
        this.body = body;
    }

    public AppResponse(Integer status, String message, T body) {
        this.status = status;
        this.message = message;
        this.body = body;
    }
}
