package com.example.toron.mapper.board;

import com.example.toron.mvc.board.BoardVO;
import com.example.toron.mvc.board.MenuVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Repository
@Mapper
public interface BoardMapper {
    Integer write(BoardVO Bvo);

    List<BoardVO> List(String id);

    List<MenuVO> getMenu();

    BoardVO getInfoData(String boardNo);


    List<MenuVO> getCategoryMenu();

    /*
    int boardCount();

    List<MenuVO> getCategoryName();
    */
}


