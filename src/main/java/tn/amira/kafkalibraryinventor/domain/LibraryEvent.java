package tn.amira.kafkalibraryinventor.domain;

public record LibraryEvent(
        Integer libraryEventId,
        LibraryEventType libraryEventType,

        Book book
) {
}
