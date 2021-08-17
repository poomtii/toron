package com.example.toron;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    /*페이지를 이동하는 방식 두 가지
    * A . 데이터 없이 단순 페이지만 이동하는 경우
    * B . 데이터를 담아와야 하는 경우*/

    //A
    @RequestMapping(value = "/")
    //타임리프가 리다이렉션 하는 방식 : templates/
    //return 값에 / 를 붙이지 않는 이유 Spring에서 teamplates/ 이딴 식으로 픽스를 박아놓고 찾기 때문에
    // String 문자열로 리턴 해주는 경우 , ModelAndView에서 setViewName("body/user/login");
    //이를 바탕으로 밸류에 /를 붙여야하는 이유 추론 할 수 있음
    public String IndexA() { return "index"; }

    @RequestMapping(value = "/user/join")
    public String openJoin() { return "body/user/join"; }



    //B DB나 내부에서 데이터를 사용 해야하는 경우.
    //ex DB에서 게시글 리스트를 뽑았는데 뷰단으로 데이터를 넘겨줘야 하는 경우에 해당
    /*@RequestMapping(value = "/")
    public ModelAndView IndexB() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("categoryList" , categoryList);
        mav.setViewName("index");
        return mav;
    }*/
}
