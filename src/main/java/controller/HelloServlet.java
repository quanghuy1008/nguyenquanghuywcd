package controller;

import dao.phonedao;
import model.phone;

import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "HomeServlet", value = "/home")
public class HelloServlet extends HttpServlet {
    phonedao dao = new phonedao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        phone p = new phone();
        p.setName(request.getParameter("samsung not 22"));
        p.setBrand(request.getParameter("samsung"));
        p.setPrice(request.getParameter("$1000"));
        p.setDescription(request.getParameter("mong nhe"));
        dao.insertphone(p);
        String msg = insertphone();
        request.setAttribute("phone", getListphone());
        request.setAttribute("message",msg);
        request.getRequestDispatcher("listphone.jsp").forward(request,response);
    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
//        String msg = updatephone();
//        String msg = deletephone();

    }
    protected List<phone> getListphone(){
        List<phone>list=dao.getListphone(4);
        return list;
    }
    protected String updatephone(){
        phone p = new phone();
        p.setId(3);
        p.setName("samsung not 44");
        p.setPrice("$1111");
        return dao.updatephone(p);
    }
    protected String insertphone() {
        phone p = new phone();
        p.setName("samsung not 22");
        p.setBrand("samsung");
        p.setPrice("$1000");
        p.setDescription("mong nhe");
        return dao.insertphone(p);
    }
    protected String deletephone() {
        return dao.deletephone(14);
    }
}