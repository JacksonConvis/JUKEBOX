package co.grandcircus.apiproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@Autowired
	FavoriteRepository favoriteRepository;
	@Autowired
	SearchService searchService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
