package co.grandcircus.apiproject;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		List<SearchResult> songResults = searchService.SearchQuery(searchTerm).getData();
		model.addAttribute("songs", songResults);
		return "searchresults";
	}

	@PostMapping("/favorite")
	public String addFavortie(@RequestParam String id, @RequestParam String title,
			@RequestParam int duration, @RequestParam String preview,
			@RequestParam String albumTitle, @RequestParam String cover, @RequestParam String name,
			Model model) {
		Album addAlbum = new Album(albumTitle, cover);
		Artist addArtist = new Artist(name);
		SearchResult addSearchResult =
				new SearchResult(id, title, duration, preview, addArtist, addAlbum);
		repo.save(addSearchResult);
		model.addAttribute("song", addSearchResult);
		return "success";
	}

	@RequestMapping("/success")
	public String showSuccess(Model model) {
		return "success";
	}

	// favorites controller not complete
	@RequestMapping("/favorites")
	public String listFaves(Model model) {
		List<SearchResult> listF = repo.findAll();
		model.addAttribute("favorites", listF);
		return "displayfavorites";
	}
	@PostMapping("/remove")
	public String removeFavorite(@RequestParam String id, Model model){
		repo.deleteById(id);
	return "redirect:/favorites";
	}
	
}
