package com.katkrazy.calculate.action;

import com.katkrazy.calculate.dao.impl.CalculateDaoImpl;
import com.katkrazy.calculate.service.CalculateService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by luke on 2017/3/16.
 * 计算具体利润率
 */
public class CalculateAction extends Action {

    public static ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

    public CalculateAction() {
        CalculateService calculateService = (CalculateService) ctx.getBean("calculateService");
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        CalculateService calculateService = (CalculateService) ctx.getBean("CalculateService");
        CalculateDaoImpl c = new CalculateDaoImpl();
        c.find();
        return null;
    }
}
