package com.example.toron.mapper.board;

import com.example.toron.common.module.BoardCriteriaModule;
import com.example.toron.mvc.board.BoardVO;
import com.example.toron.mvc.board.MenuVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface BoardMapper {
    Integer write(BoardVO Bvo);

    List<BoardVO> List(String id);

    List<MenuVO> getMenu();

    BoardVO getInfoData(String no);

    int viewCnt(String board_code);

    List<Map<String, Object>> boardList(BoardCriteriaModule cri)throws Exception;

    int boardListCnt()throws Exception;




    /*
    int boardCount();
    List<MenuVO> getCategoryMenu();
    List<MenuVO> getCategoryName();
    */
}


