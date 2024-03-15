package jp.ac.ohara.shiftManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.ohara.shiftManager.model.UserAddModel;
import jp.ac.ohara.shiftManager.service.UserAddModelService;

@Controller
public class UserAddController {

    @Autowired
    private UserAddModelService userService;

    @GetMapping("/")
    public String showTopPage(@ModelAttribute("user") UserAddModel user) {
        return "top"; // ".html" 拡張子は省略
    }

    @PostMapping("/")
    public String registerUser(@ModelAttribute("user") UserAddModel user, RedirectAttributes redirectAttributes) {
        String result = userService.registerNewUser(user);
        if (result.equals("ユーザーが正常に登録されました")) {
            // 登録が成功した場合はリダイレクトする
            return "redirect:/shifts";
        } else {
            // 登録が失敗した場合はエラーメッセージを表示
            redirectAttributes.addFlashAttribute("errorMessage", result);
            return "redirect:/"; // リダイレクトしてもう一度トップページを表示
        }
    }
}
