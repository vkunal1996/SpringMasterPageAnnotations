/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vkunal1996
 */
@Controller
public class Conclusion {
    @RequestMapping
    public String conclusion(ModelMap mm){
        return "conclusion";
    }
}
