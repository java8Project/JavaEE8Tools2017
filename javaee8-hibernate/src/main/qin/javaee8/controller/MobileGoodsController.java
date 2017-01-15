package qin.javaee8.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import qin.javaee8.core.JavaEE8BaseSupport;

@Controller
@Scope("prototype")
@RequestMapping(value = "/mobile")
public class MobileGoodsController implements JavaEE8BaseSupport
{
    private static final long serialVersionUID = 6588007741660272802L;

    /** 返回手机首页 */
    @RequestMapping(value = "/doMainView") public ModelAndView doMainView() {
        return new ModelAndView("/mobile/doMainView");
    }
}