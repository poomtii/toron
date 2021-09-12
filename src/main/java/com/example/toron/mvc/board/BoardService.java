package com.example.toron.mvc.board;

import com.example.toron.common.module.OutputJavaScriptModule;
import com.example.toron.mapper.board.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)

public class BoardService {



    @Autowired
    private BoardMapper bMap;

    public Integer write_board(BoardVO Bvo) throws IOException { return bMap.write(Bvo); }


    public List<BoardVO> boardList(String id){ return bMap.List(id); }


    public List<MenuVO> getMenu() {
        return bMap.getMenu();
    }

    public BoardVO bbsInfoData(String boardNo) {
        return bMap.getInfoData(boardNo);
    }

    public List<MenuVO> getCategoryMenu(){ return bMap.getMenu(); }
/*
    public List<MenuVO> catrgoryList(){ return bMap.getMenu(); }

    public List<MenuVO> getCategoryName(){ return bMap.getCategoryName(); }

    public int board_count(){ return bMap.boardCount(); }*/
}
