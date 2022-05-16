package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConsultarCertificado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Certificación</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>Solicitar certificado</h1>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <form method=\"post\" action=\"Reporte/CargoDesempenado.jsp\" target=\"_black\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Certificado de cargo desempeñado</label><br>\n");
      out.write("                    <label>Ingrese número documento nuevamente</label><br>\n");
      out.write("                    <input type=\"text\" name=\"numeroDocumento\" id=\"txtidcliente\" placeholder=\"Ingrese número de documento\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <input type=\"submit\" name=\"button\" id=\"button\" value=\"Generar Reporte\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <form method=\"post\" action=\"Reporte/SueldoBasico.jsp\" target=\"_black\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Certificado de sueldo básico</label><br>\n");
      out.write("                    <label>Ingrese número documento nuevamente</label><br>\n");
      out.write("                    <input type=\"text\" name=\"numeroDocumento\" id=\"txtidcliente\" placeholder=\"Ingrese número de documento\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <input type=\"submit\" name=\"button\" id=\"button\" value=\"Generar Reporte\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <form method=\"post\" action=\"Reporte/TiempoDeServicio.jsp\" target=\"_black\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Certificado de tiempo de servicio</label><br>\n");
      out.write("                    <label>Ingrese número documento nuevamente</label><br>\n");
      out.write("                    <input type=\"text\" name=\"numeroDocumento3\" id=\"txtidcliente\" placeholder=\"Ingrese número de documento\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <input type=\"submit\" name=\"button\" id=\"button\" value=\"Generar Reporte\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section>\n");
      out.write("            <form method=\"post\" action=\"Reporte/TipoDeContrato.jsp\" target=\"_black\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Certificado de tipo de contrato</label><br>\n");
      out.write("                    <label>Ingrese número documento nuevamente</label><br>\n");
      out.write("                    <input type=\"text\" name=\"numeroDocumento4\" id=\"txtidcliente\" placeholder=\"Ingrese número de documento\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    &nbsp;\n");
      out.write("                    <input type=\"submit\" name=\"button\" id=\"button\" value=\"Generar Reporte\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
