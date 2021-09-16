package com.example.toron.common.module;

public class BoardPagingModule {
    private int totalCount;             //게시판전체 데이터 갯수
    private int displayPageNum = 10;    //게시판 페이지에서 한번에 보여질 페이지 번호의 갯수
    /*
      displayPageNum
      이 부분에 대한 설정이 하단 페이징 목록의 1 2 3 ... 10 을 결정한다.
      내가 10으로 설정했으면 [1 ~ 10 다음]까지만 하단에 나오고
      11페이지 이후부터 [이전 11 ~ 20 다음] 이런식으로 출력된다.
    */

    private int startPage;      //화면의 시작 번호
    private int endPage;        //화면의 끝 번호
    private boolean prev;       //페이징 이전버튼 활성화 여부
    private boolean next;       //페이징 다음버튼 활성화 여부

    private BoardCriteriaModule cri;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount){
        this.totalCount = totalCount;

        pagingData();
    }

    private void pagingData(){

        endPage = (int) (Math.ceil(cri.getPage() / (double)displayPageNum) * displayPageNum);
        //endPage = (현재 페이지 번호 / 화면에 보여질 페이지 번호의 갯수) * 화면에 보여질 페이지 번호의 갯수
        startPage = (endPage - displayPageNum) + 1;
        //startPage = (끝페이지 번호 - 화면에 보여질 페이지 갯수) + 1

        int tempEndPage = (int)(Math.ceil(totalCount / (double)cri.getPerPageNum()));
        if(endPage > tempEndPage){
            endPage = tempEndPage;
        }//마지막페이지 번호 = 총 게시글 수 / 한 페이지당 보여줄 게시글의 갯수

        prev = startPage == 1 ? false : true;
        //이전 버튼 생성 여부 = 시작페이지 번호가 1과 같으면 false, 아닐시에 true
        next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
        //다음 버튼 생성 여부 = 끝 페이지 번호 * 한 페이지당 보여줄 게시글의 갯수가 총 게시글 수보다 크거나 같으면 false, 아닐시에 true
    }

    public void setDisplayPageNum(int displayPageNum){
        this.displayPageNum = displayPageNum;
    }
    public int getStartPage(){
        return startPage;
    }
    public void setStartPage(){
        this.startPage = startPage;
    }
    public int getEndPage(){
        return endPage;
    }
    public void setEndPage(){
        this.endPage = endPage;
    }

    public boolean isPrev(){
        return prev;
    }
    public void setPrev(){
        this.prev = prev;
    }
    public boolean isNext(){
        return next;
    }
    public void setNext(){
        this.next = next;
    }
    public BoardCriteriaModule getCri(){
        return cri;
    }
    public void setCri(BoardCriteriaModule cri){
        this.cri = cri;
    }

    @Override
    public String toString(){
        return "PageMaker [totalCount=" + totalCount + ", startPage=" + startPage + ", endPage=" + endPage + ", prev="
                + prev + ", next=" + next  +",displayPageNum=" + displayPageNum + ", cri=" + cri + "]";
    }
}
