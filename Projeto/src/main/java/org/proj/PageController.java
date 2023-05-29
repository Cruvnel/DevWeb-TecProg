package org.proj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    //    Rota raiz
    @RequestMapping("/")
    @ResponseBody
    public ModelAndView raiz(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("raiz.html");
        return modelAndView;
    }
    //    Rota calculo das médias
    @RequestMapping("/notas/")
    @ResponseBody
    public ModelAndView notas(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("notas.html");
        return modelAndView;
    }
    //    Rota verifica CEP
    @RequestMapping("/cep/")
    @ResponseBody
    public ModelAndView cep(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cep.html");
        return modelAndView;
    }
}
