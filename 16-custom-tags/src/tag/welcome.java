package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class welcome extends TagSupport{
   public String message;
   
   
   
	public String getMessage() {
	return message;
}



public void setMessage(String message) {
	this.message = message;
}



	@Override
	public int doStartTag() throws JspException {
	
		
		JspWriter out=pageContext.getOut();
		try {
			out.println("<h1> "+message+" : Good Morning...</h1>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
		 
		
		
		
	}

	
	  
	
}
