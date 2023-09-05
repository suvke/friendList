package friends.friendList.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import friends.friendList.domain.Friend;


@Controller
public class FriendListController {
	
	List<Friend> kaverit = new ArrayList<>();
	
	@GetMapping("/index")
	public String getFriendName(Model model) {
		model.addAttribute("friend", new Friend());
		model.addAttribute("kaverit", kaverit);
		return "friendList.html";
	}
	
	@PostMapping("/addfriend")
	public String addFriend(@ModelAttribute Friend friend) {
		kaverit.add(friend);
		return "redirect:/index";
	}

}
