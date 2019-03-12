package ca.sheridancollege;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Cartoon;

@Controller
public class HomeController implements Serializable {

	public ArrayList<Cartoon> populateData() {

		ArrayList<Cartoon> cartoonList = new ArrayList<Cartoon>();
		Cartoon c1 = new Cartoon(1, "Tom&Jerry", "Jerry");
		Cartoon c2 = new Cartoon(2, "CaptainPlanet", "Superman");
		Cartoon c3 = new Cartoon(3, "Inazuma11", "Axel");

		cartoonList.add(c1);
		cartoonList.add(c2);
		cartoonList.add(c3);
		return cartoonList;

	}

	@RequestMapping("/")
	public String goHome(Model model) {

		model.addAttribute("cartoon", populateData());
		return "home";
	}

	@RequestMapping(value = "update/{id}", method = RequestMethod.GET)
	public String updateCartoon(@PathVariable int id, Model model) {

		ArrayList<Cartoon> cartoonList = new ArrayList<Cartoon>();
		cartoonList = populateData();

		model.addAttribute("cartoon", cartoonList.get(id - 1));
		return "modify";
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String deleteCartoon(Model model, @PathVariable int id) {

		ArrayList<Cartoon> cartoonList = new ArrayList<Cartoon>();
		cartoonList = populateData();
		cartoonList.remove(id - 1);
		model.addAttribute("cartoon", cartoonList);

		return "home";
	}

	@RequestMapping(value = "modify/{id}", method = RequestMethod.POST)
	public String modifyValue(@PathVariable int id, @RequestParam String show,@RequestParam String character, Model model) {

		ArrayList<Cartoon> cartoonList = new ArrayList<Cartoon>();
		cartoonList = populateData();

		cartoonList.set(id - 1, new Cartoon(id, show, character));

		model.addAttribute("cartoon", cartoonList);
		return "home";
	}

}
