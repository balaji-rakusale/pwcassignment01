package com.pwc.SpringBootCrudEx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpoyeeException extends  Exception{

    private String errorMessage;
}
