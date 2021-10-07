package uz.pdp.hr_management.model.res;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponse {

    String message;
    Object object;
    boolean success;

    public ApiResponse(String message) {
        this.message = message;
        this.object=null;
        this.success=false;
    }

    public ApiResponse(Object object) {
        this.message = null;
        this.object=object;
        this.success=true;
    }

    public ApiResponse(String message,boolean success) {
        this.message = message;
        this.object=null;
        this.success=success;
    }
}
