package jp.ac.ohara.shiftManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.ac.ohara.shiftManager.model.UserAddModel;
import jp.ac.ohara.shiftManager.service.LoginService;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.htmlに遷移
    }

    @PostMapping("/login")
    public String loginUser(UserAddModel user, RedirectAttributes redirectAttributes) {
        String result = loginService.authenticateUser(user.getUsername(), user.getPassword());
        if (result.equals("認証成功")) {
            // 認証成功した場合はリダイレクトして適切なページに移動する
            return "redirect:/shifts";
        } else {
            // 認証失敗の場合はエラーメッセージを表示してログインページに戻る
            redirectAttributes.addFlashAttribute("errorMessage", result);
            return "redirect:/login";
        }
    }
}
