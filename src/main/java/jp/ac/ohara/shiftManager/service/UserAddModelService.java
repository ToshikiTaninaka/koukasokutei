package jp.ac.ohara.shiftManager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.ac.ohara.shiftManager.model.UserAddModel;
import jp.ac.ohara.shiftManager.repository.UserAddModelRepository;

@Service
public class UserAddModelService {

    @Autowired
    private UserAddModelRepository userRepository;

    // 新規登録機能のメソッド
    public String registerNewUser(UserAddModel user) {
        // ユーザーネームの重複チェック
        if (userRepository.existsByUsername(user.getUsername())) {
            return "ユーザーネームが既に使用されています";
        }
        // メールアドレスの重複チェック
        if (userRepository.existsByMailAddress(user.getMailAddress())) {
            return "メールアドレスが既に使用されています";
        }
        // 電話番号の重複チェック
        if (userRepository.existsByTelephoneNumber(user.getTelephoneNumber())) {
            return "電話番号が既に使用されています";
        }
        // いずれも重複していない場合は新規登録を行う
        userRepository.save(user);
        return "ユーザーが正常に登録されました";
    }
}
