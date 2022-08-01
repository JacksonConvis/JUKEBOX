package co.grandcircus.apiproject;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@Autowired
	private FavoriteRepository repo;
	@Autowired
	private SearchService searchService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@PostMapping("/searchresults")
	public String showResults(@RequestParam String searchTerm, Model model) {
		model.addAttribute("songs", searchService.SearchQuery(searchTerm));
		return "searchresults";
	}

	 @PostMapping("/addfavorite")
	  public String addFavortie(@RequestParam String _id,
	  @RequestParam String title,
	  @RequestParam String link,
	  @RequestParam int duration,
	  @RequestParam String preview,
	  @RequestParam Artist artist,
	  @RequestParam Album album,
	  @RequestParam String type, Model model) {
		 
		 SearchResult newFav = new SearchResult(_id, title, link, duration, preview, artist, album, type);
		 
		 repo.save(newFav);
		 
	  return "redirect:/searchresult";
	  }


}
