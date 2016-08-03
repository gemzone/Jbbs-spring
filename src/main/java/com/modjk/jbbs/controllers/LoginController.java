package com.modjk.jbbs.controllers;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController 
{
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	

}

	
	
// 	@RequestMapping("/test")
//	public String view(Model model)
//	{
//		List<PostComments> commentList = simpleCommentRepository.findAll();
//		model.addAttribute("CommentList", commentList);
//		return "SimpleComment/simple-comment";
//	}



/*

public LoginController()
{
	super();
	// TODO Auto-generated constructor stub
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	PrintWriter out = response.getWriter();
	
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	
//	response.setHeader("Expires", "Tue, 03 Jul 2001 06:00:00 GMT");	// Proxies
//	response.setHeader("Last-Modified", new Date().toString());
//	response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate, max-age=0, post-check=0, pre-check=0");	// HTTP 1.1
//	response.setHeader("Pragma", "no-cache");	// HTTP 1.0
	
	// text/html
	// application/json
	// text/xml
	// text/plain
	response.setContentType("application/json");
	JSONObject json = new JSONObject();
	
	out.print(json.toString());
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	// TODO Auto-generated method stub
	PrintWriter out = response.getWriter();
	
	String contentType = request.getHeader("content-type"); 
	HttpSession session = request.getSession();
	Integer userId = (Integer)session.getAttribute("user_id");
	
	Param param = new Param(request);

	String id = param.getString("id");
	String password = param.getString("password");
	
	DataSource ds = (DataSource)Context.lookup("JNK");
	UserJDBCTemplate userJDBCTemplate = new UserJDBCTemplate();
	userJDBCTemplate.setDataSource(ds);
	
	
	User user = userJDBCTemplate.login(id, password);
	
	if( user == null ) 
	{
		user = new User();
		user.error = 1;
		user.reason = "login_failed";
	}
	
	
	if( "application/xml".contentEquals( contentType ) || "text/xml".contentEquals( contentType ) )	// xml 아니면
	{
		response.setContentType("text/xml");
		
		XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
		StringWriter sw = new StringWriter();
		XMLStreamWriter xsw = null;
		XmlMapper xmlMapper = new XmlMapper(xmlInputFactory);
		
		try
		{
			xsw = xmlOutputFactory.createXMLStreamWriter(sw);
			xsw.writeStartDocument();
			
			xmlMapper.writeValue(xsw, user);
			
			xsw.writeEndDocument();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
		out.print(sw.toString());
	}
	else
	{
		response.setContentType("application/json");
		
		JSONObject json = new JSONObject();
		
		json = Mapper.toJSONObject(user);
		
		out.print(json.toString());
	}
}

protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
	PrintWriter out = response.getWriter();
	JSONObject json = new JSONObject();
	
	out.print(json.toString());
}

protected void doDelete(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
{
	PrintWriter out = response.getWriter();
	JSONObject json = new JSONObject();
	
	out.print(json.toString());
}

//logger.debug( "Content-Type : " +  request.getHeader("Content-Type")  ) ;
//
//logger.debug( "content-type : " +  request.getHeader("content-type")  ) ;
//
//Map<String, String> map = new HashMap<String, String>();
//
//Enumeration headerNames = request.getHeaderNames();
//while (headerNames.hasMoreElements()) {
//	String key = (String) headerNames.nextElement();
//	String value = request.getHeader(key);
//	map.put(key, value);
//	
//	logger.debug(key + " : " + value);
//}

*/