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
public class MyFriedsAppController {

    public static List<Friend> friends = new ArrayList<>();

    static {
        friends.add(new Friend("Minna", "Minnanen"));
        friends.add(new Friend("Tanja", "Tanjanen"));
        friends.add(new Friend("Jukka", "Jukkanen"));
    }

    @GetMapping("/myfriendsapp")
    public String getFriends(Model model) {
        model.addAttribute("friends", friends);
        model.addAttribute("friend", new Friend());
        return "myfriendsapp";
    }

    @PostMapping("/myfriendsapp")
    public String addFriend(@ModelAttribute Friend friend) {
        friends.add(friend);
        return "redirect:/myfriendsapp";
    }

}
