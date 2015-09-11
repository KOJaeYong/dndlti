package net.qna.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*spring mvc에서 해당 클래스를 컨트롤러로 인식하기 위해서 @Controller 라는 어노테이션 사용 */  
@Controller
public class HomeController {
	/*Logger 추가*/
	/*private static final Logger log = LoggerFactory.getLogger(HomeController.class);*/
	
	/*처음 사이트에 접속했을 때 http://localhost:8080/에 접근했을 때 이 메소드로 요청이 들어오도록 매핑
	매핑하는 어노테이션 @RequestMapping("/") 매핑할 url은 /, home은 이동할 뷰의 이름 */	
	@RequestMapping("/")
	public String home() {
		/*log.debug("logback setting success!");*/
		// /home.jsp(prefix + view 이름 + suffix)
		// prefix(/)은  webapp 폴더에 해당.
		// webapp 폴더에 있는 home.jsp(물리적인 뷰 파일 결정) 파일을 요청 
		return "home";
	}
}
