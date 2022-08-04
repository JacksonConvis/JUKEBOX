package co.grandcircus.apiproject;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
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
		List<SearchResult> songResults = searchService.SearchQuery(searchTerm).getData();
		List<SearchResult> likedSongs = repo.findAll();
		
	
	
		
		
		model.addAttribute("songs", songResults);
		model.addAttribute("liked", likedSongs);
		return "searchresults";
	}
	

	@PostMapping("/addfavorite")
	public String addFavortie(@RequestParam String id, @RequestParam String title,
			@RequestParam int duration, @RequestParam String preview,
			@RequestParam String albumTitle, @RequestParam String cover, @RequestParam String name,
			@RequestParam(required=false, defaultValue="false") boolean liked,
			Model model) {
		
		
		liked = true;
		
		Album addAlbum = new Album(albumTitle, cover);
		Artist addArtist = new Artist(name);
		SearchResult addSearchResult =
				new SearchResult(id, title, duration, preview, addArtist, addAlbum, liked);
		repo.save(addSearchResult);
		model.addAttribute("song", addSearchResult);
		return "redirect:/favorites";
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
		return "favorites";
	}

	@PostMapping("/remove")
	public String removeFavorite(@RequestParam String id, Model model) {
		repo.deleteById(id);
		List<SearchResult> listF = repo.findAll();
		model.addAttribute("favorites", listF);
		return "redirect:/favorites";
	}
	
	@RequestMapping("/searchBy")
	public String searchList(Model model, @RequestParam String searchTerm) {

		List<SearchResult> listF = new ArrayList<>();
			listF = repo.findByTitleContaining(searchTerm);
		
		
		
		model.addAttribute("favorites", listF); 
		return "favorites";
	}

}
