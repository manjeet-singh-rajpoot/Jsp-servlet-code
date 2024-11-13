package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class demo extends TagSupport{
public int side;
	
	public int getSide() {
	return side;
}
public void setSide(int side) {
	this.side = side;
}
	@Override
	public int doStartTag() throws JspException {
	
		
		JspWriter out=pageContext.getOut();
		
		try {
			out.println("<h1>Welcome to Demo Page....</h1>");
			out.println("<hr>");
			out.println("<h1>Area of square: "+side*side+"</h1>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
		 
		
		
		
	}

	
	  
	
}
