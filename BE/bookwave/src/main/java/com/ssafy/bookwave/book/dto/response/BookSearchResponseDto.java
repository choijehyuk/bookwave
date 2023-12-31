package com.ssafy.bookwave.book.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookSearchResponseDto {
    int bookListCnt;
    List<BookListBySearchResponseDto> bookList;
}
