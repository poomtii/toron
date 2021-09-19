package com.example.toron.mapper.board;

import com.example.toron.mvc.board.BoardVO;
import com.example.toron.mvc.board.Criteria;
import com.example.toron.mvc.board.MenuVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface BoardMapper {
    Integer write(BoardVO Bvo);

    List<BoardVO> List(String id, Criteria criteria);

    List<MenuVO> getMenu();

    BoardVO getInfoData(String no);

    int viewCnt(String board_code);

    public int selectBoardTotalCount(Criteria criteria);




    /*
    int boardCount();
    List<MenuVO> getCategoryMenu();
    List<MenuVO> getCategoryName();
    */
}


