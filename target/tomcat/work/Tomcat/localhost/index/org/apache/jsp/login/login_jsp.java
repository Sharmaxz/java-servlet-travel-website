/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-02-20 21:06:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/login/carousel.jsp", Long.valueOf(1550688829468L));
    _jspx_dependants.put("/login/formLogin.jsp", Long.valueOf(1550696809520L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=en\"\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\" />\r\n");
      out.write("        <title>Wild Travel - Login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.2/css/all.css\" integrity=\"sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"/index/login/css/style.css\"> <!-- doesnt working -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"/index/login/js/script.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("<div id=\"myCarousel\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\r\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img src=\"https://europatotal.com.br/wp-content/uploads/2018/10/verona-1.png\" class=\"img-responsive\" id=\"carousel-img\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"http://eskipaper.com/images/top-city-wallpapers-1.jpg\" class=\"img-responsive\" id=\"carousel-img\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"http://www.creativehdwallpapers.com/uploads/large/city/top-5-city-wallpaper.jpg\" class=\"img-responsive\" id=\"carousel-img\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("<div id=\"signIn\" class=\"container-login-center\">\r\n");
      out.write("    <div class=\"container-login shadow p-3 mb-5 rounded\">\r\n");
      out.write("        <form id=\"formLogin\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label>SIGN IN</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"InputEmail\">Email</label>\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"InputEmail\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"InputPassword\">Password</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"InputPassword\" >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"form-check\">\r\n");
      out.write("                    <input class=\"form-check-input\" type=\"checkbox\" value=\"\" id=\"invalidCheck3\">\r\n");
      out.write("                    <label class=\"form-check-label\">\r\n");
      out.write("                        Remember me\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card-footer\" >\r\n");
      out.write("                <div class=\"d-flex justify-content-center links\">\r\n");
      out.write("                    <a style=\"color: white\"> Don't have an account? &nbsp;</a><a id=\"signUp\" href=\"\" onclick=\"return false;\">Sign Up</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                    <a href=\"#\">Forgot your password?</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <form id=\"formRegistration\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <a href=\"\" class=\"fas fa-chevron-left\" onclick=\"return false;\"></a>\r\n");
      out.write("                <label>REGISTRATION</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"InputRName\">Fullname</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"InputRName\" onkeyup=\"this.value=this.value.replace(/([^a-zA-Z \\u00C0-\\u00FF])/g,'');\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"InputREmail\">Email</label>\r\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"InputREmail\" onkeyup=\"this.value=this.value.replace(/ [\\u00C0-\\u00FF]]/,'');\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"InputRPassword\">Password</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"InputRPassword\" >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"InputRCPassword\">Confirm Password</label>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"InputRCPassword\" >\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
