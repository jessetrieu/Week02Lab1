/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 579957
 */
public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
                String age = request.getParameter("age");
               
                if(age==null){
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

                }
                if(age.trim().isEmpty()){
                    request.setAttribute("errorMessage", "You must give your current age.");
                    getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

                }
                
                if(age!=null){
                    try{
                    int nextAge = Integer.parseInt(age);
                    nextAge++;
                    request.setAttribute("ageNextYear", "Your age next birthday is "+nextAge);
                    getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                    }
                    catch(NumberFormatException e){
                        request.setAttribute("errorMessage","Please enter a numeric value.");
                        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

                    }
                }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
