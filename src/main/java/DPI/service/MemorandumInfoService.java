package DPI.service;

import java.util.List;

import DPI.entity.MemorandumInfo;

public interface MemorandumInfoService {

	void insertMemorandumInfo(MemorandumInfo memorandumInfo);
	List<MemorandumInfo> loadAllMemorandumInfo(String openid);
}
