package jp.ac.ohara.shiftManager.service;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import jp.ac.ohara.shiftManager.model.ShiftManagerModel;
import jp.ac.ohara.shiftManager.repository.ShiftManagerModelRepository;

@Service
public class ShiftManagerModelService {

    private final ShiftManagerModelRepository shiftManagerModelRepository;

    public ShiftManagerModelService(ShiftManagerModelRepository shiftManagerModelRepository) {
        this.shiftManagerModelRepository = shiftManagerModelRepository;
    }

    public List<ShiftManagerModel> getAllShifts() {
        return shiftManagerModelRepository.findAll();
    }

    public ShiftManagerModel getShiftById(long id) {
        return shiftManagerModelRepository.findById(id).orElse(null);
    }

    public ShiftManagerModel saveShift(ShiftManagerModel shift) {
        return shiftManagerModelRepository.save(shift);
    }

    public void deleteShiftById(long id) {
        shiftManagerModelRepository.deleteById(id);
    }

    // シフト表を表示するためのメソッド
    public List<ShiftManagerModel> getShiftTable() {
        return getAllShifts(); // すべてのシフト情報を取得して返す
    }
    
    public void save(@NonNull ShiftManagerModel shiftManagerModel) {
		this.shiftManagerModelRepository.save(shiftManagerModel);
	}
}
