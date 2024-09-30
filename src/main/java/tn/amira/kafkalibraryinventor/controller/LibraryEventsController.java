package tn.amira.kafkalibraryinventor.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.amira.kafkalibraryinventor.domain.LibraryEvent;

@RestController
@Slf4j
public class LibraryEventsController {

    @PostMapping("/v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(
            @RequestBody LibraryEvent libraryEvent
    ) {
        log.info("LibraryEvent : {}", libraryEvent);
        //invoke the kafka producer

        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }
}
