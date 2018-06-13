package co.simplon.oauth2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassController {

@RequestMapping ("/np/private")
	public String MaFonction () {
		return "private";
	}
}
