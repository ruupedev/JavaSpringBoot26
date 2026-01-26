package k26.week2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import domain.Friend;

@Controller
public class FriendController {

    public static List<Friend> friends = new ArrayList<>();

    static {
        friends.add(new Friend("Minna", "Minnanen"));
        friends.add(new Friend("Tanja", "Tanjanen"));
        friends.add(new Friend("Jukka", "Jukkanen"));
    }

    @GetMapping("/friends")
    public String getFriends(Model model) {
        model.addAttribute("friends", friends);
        return "friends";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("friend", new Friend());
        return "add";
    }

    @PostMapping("/add")
    public String addFriend(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/friends";
    }

}
