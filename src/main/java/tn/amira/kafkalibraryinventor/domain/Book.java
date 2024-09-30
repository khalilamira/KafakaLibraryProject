package tn.amira.kafkalibraryinventor.domain;

public record Book(
        Integer bookId,
        String bookName,
        String bookAuthor
) {
}
