package com.itlike.web;

import com.itlike.domain.Goods;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class HelloAction extends ActionSupport implements ModelDriven<Goods> {
    private Goods goods = new Goods();

    @Override
    public String execute() throws Exception {
        //获取值栈
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Goods goods1 = new Goods();
        goods1.setName("111");
        goods1.setPrice(20.0);
        valueStack.getRoot().push(goods1);
//        valueStack.getRoot().pop();
        ActionContext.getContext().put("clown","chensiqi");
        ActionContext.getContext().getSession().put("session_clown","session_chensiqi");
        ActionContext.getContext().getApplication().put("app_clown","app_chensiqi");
        System.out.println(this.goods);
        return SUCCESS;
    }

    @Override
    public Goods getModel() {
        return goods;
    }
}
