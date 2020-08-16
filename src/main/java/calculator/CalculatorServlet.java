package calculator;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/calculator")
class CalculatorServlet extends HttpServlet {
    int pharseMeter;
    int pharseCentymeter;
    int pharseMilimeter;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String meter = request.getParameter("meter");
        String centymeter = request.getParameter("centymeter");
        String milimeter = request.getParameter("milimeter");

        pharseMeter = Integer.valueOf(meter);
        pharseCentymeter = Integer.valueOf(centymeter);
        pharseMilimeter = Integer.valueOf(milimeter);


            java.io.PrintWriter writer = response.getWriter();
            writer.println(pharseMeter);


        System.out.println(pharseCentymeter);
        System.out.println(pharseMeter);
        System.out.println(pharseMilimeter);


    }

//    public static choosenParameter(int pharseMeter, int pharseCentymeter, int pharseMilimeter) {


}

