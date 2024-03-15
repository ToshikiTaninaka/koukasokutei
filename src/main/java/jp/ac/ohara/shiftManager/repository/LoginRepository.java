package jp.ac.ohara.shiftManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.shiftManager.model.UserAddModel;

@Repository
public interface LoginRepository extends JpaRepository<UserAddModel, Long> {

    // ユーザー名を使ってユーザーを検索するメソッド
    UserAddModel findByUsername(String username);
}
