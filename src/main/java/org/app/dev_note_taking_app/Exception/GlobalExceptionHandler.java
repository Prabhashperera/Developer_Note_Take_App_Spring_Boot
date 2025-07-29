package org.app.dev_note_taking_app.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.app.dev_note_taking_app.util.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse> genericHandler(Exception ex) {
        return ResponseEntity.ok(new ApiResponse(ex.getMessage(), HttpStatus.BAD_REQUEST, null));
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex) {
        return ResponseEntity.ok(new ApiResponse(ex.getMessage(), HttpStatus.NOT_FOUND, null));
    }
}
