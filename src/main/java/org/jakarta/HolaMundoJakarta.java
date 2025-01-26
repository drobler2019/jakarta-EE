package org.jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hola-mundo")
public class HolaMundoJakarta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        var out = resp.getWriter();
        out.write("<!DOCTYPE html>");
        out.write("<html lang=\"es\">");
        out.write("  <head>");
        out.write("    <meta charset=\"UTF-8\">");
        out.write("    <title>Title</title>");
        out.write("  </head>");
        out.write("  <body>");
        out.write("    <h1>¡Mi primera aplicación con Jakarta!</h1>");
        out.write("  </body>");
        out.write("</html>");
        out.close();
    }

}
