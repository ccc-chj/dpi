package DPI.wecontroller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DPI.entity.MemorandumInfo;
import DPI.service.MemorandumInfoService;

@RestController
public class MemorandumController {
	@Autowired
	private MemorandumInfoService memorandumInfoService;
	
	@RequestMapping("/insertMemorandumInfo")
	public void insertMemorandumInfo(String title, String content, HttpServletRequest request) {
		Date date = new Date();
		SimpleDateFormat matter = new SimpleDateFormat("yyyy/MM/dd");
		MemorandumInfo memorandumInfo = new MemorandumInfo();
		memorandumInfo.setOpenid(request.getSession().getAttribute("openId").toString());
		memorandumInfo.setDate(matter.format(date));
		memorandumInfo.setContent(content);
		memorandumInfo.setTitle(title);
		
		memorandumInfoService.insertMemorandumInfo(memorandumInfo);;
	}
	
	@RequestMapping("/loadAllMemorandumInfo")
	public List<MemorandumInfo> loadAllMemorandumInfo(HttpServletRequest request) {
		return memorandumInfoService.loadAllMemorandumInfo(request.getSession().getAttribute("openId").toString());
	}
}
