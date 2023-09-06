package fi.haagahelia.testProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FriendController {

    private List<String> friends = new ArrayList<>();

    @RequestMapping("/friend")
    public String index(Model model) {
        model.addAttribute("friends", friends);
        return "friend";
    }

    @PostMapping("/addFriend")
    public String addFriend(String name) {
        if (!name.isEmpty()) {
            friends.add(name);
        }
        return "redirect:/friend";
    }
}
