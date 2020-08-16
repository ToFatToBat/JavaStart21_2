package calculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calculator")
class CalculatorServlet extends HttpServlet {

    protected void doGet (HttpServletRequest request, HttpServletResponse response) {
        String meter = request.getParameter("meter");
        String cemtymeter = request.getParameter("centymeter");
        String milimeter = request.getParameter("milimeter");


    }


}
