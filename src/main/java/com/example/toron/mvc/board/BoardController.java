package com.example.toron.mvc.board;

import com.example.toron.common.module.OutputJavaScriptModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * BoardController
 * @author : 안성엽
 * @date   : 2021-08-05
**/

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @Autowired
    private BoardService bSvc;
    OutputJavaScriptModule oJm;


    //List에 데이터를 담는다는 건 SELECT를 해줬음을 의미함(보통)
    //하지만 List에 담긴 데이터를 View 그냥 쓸 순 없음.
    //그래서 addAttribute를 해주거나 addObject를 해주면 View 사용 할 수 있다. (addObject는 ModelAndView에 있음)
    //별칭이 붙은 List는 View에서 또 다른 별칭을 부여한 후 데이터를 뽑아올 수 있음. th:each="View별칭 : ${AttributeName}"
                                                                                  //th:text="${View별칭.데이터}"
    @GetMapping(value = "list.go")
    public String OpenList(Model model) {
        model.addAttribute("board_list", bSvc.boardList());
        return "body/board/list";
    }

    @GetMapping(value = "/info")
    public ModelAndView getInfoData(@ModelAttribute("no") String boardNo) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("bInfoData", bSvc.bbsInfoData(boardNo));
        mav.setViewName("body/board/info");
        return mav;
    }

    @GetMapping(value = "/writeFrom")
    public ModelAndView OpenWrite() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("mnList",bSvc.getMenu());
        mav.setViewName("/body/board/write");
        return mav;
    }

    @PostMapping(value = "/bbsWriteAction")
    public void bbsWriteAction(BoardVO Bvo, HttpServletResponse res) throws IOException {
        Integer result = bSvc.write_board(Bvo);

        if(result == 1){
            oJm.outPrintScript("writeDone", res);
        }else{
            oJm.outPrintScript("error", res);

        }



        /*return result;*/


    }

}
