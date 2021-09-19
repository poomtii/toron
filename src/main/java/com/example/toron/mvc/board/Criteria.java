package com.example.toron.mvc.board;

import lombok.*;

@Getter
@Setter
public class Criteria {
    private int currentPageNo;
    private int recordsPerPage;
    private int PageSize;
    private String searchKeyword;
    private String searchType;

    public Criteria(){
        this.currentPageNo = 1;
        this.recordsPerPage = 10;
        this.PageSize = 10;
    }

    public int getStartPage(){
        return (currentPageNo - 1) * recordsPerPage;
    }
}
/*
    private int currentPageNo = 현재 페이지 번호
    private int recordsPerPage = 페이지 당 출력할 데이터 개수
    private int PageSize = 화면 하단에 출력할 페이지 사이즈
    private String searchKeyword = 검색 키워드
    private String searchType = 검색 유형
*/