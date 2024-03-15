package jp.ac.ohara.shiftManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.shiftManager.model.UserAddModel;

@Repository
public interface UserAddModelRepository extends JpaRepository<UserAddModel, Long> {

    // ユーザーネームの重複チェック
    boolean existsByUsername(String username);

    // 電話番号の重複チェック
    boolean existsByTelephoneNumber(String telephoneNumber);

    // メールアドレスの重複チェック
    boolean existsByMailAddress(String mailAddress);
}
