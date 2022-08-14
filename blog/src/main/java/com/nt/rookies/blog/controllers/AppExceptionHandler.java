package com.nt.rookies.blog.controllers;

import com.nt.rookies.blog.dtos.ErrorMessage;
import com.nt.rookies.blog.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AppExceptionHandler {
  @ExceptionHandler(NotFoundException.class)
  public ResponseEntity<ErrorMessage> handleNotFoundException(
      NotFoundException ex, WebRequest request) {
    return new ResponseEntity<>(new ErrorMessage(ex.getMessage()), HttpStatus.NOT_FOUND);
  }
}
