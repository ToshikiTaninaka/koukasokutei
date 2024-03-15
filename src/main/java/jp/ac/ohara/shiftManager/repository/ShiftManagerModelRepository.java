package jp.ac.ohara.shiftManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.ac.ohara.shiftManager.model.ShiftManagerModel;
public interface ShiftManagerModelRepository extends JpaRepository<ShiftManagerModel, Long> {
    // カスタムのクエリメソッドやデータ操作が必要な場合はここに追加します
}
