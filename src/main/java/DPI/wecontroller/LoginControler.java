package DPI.wecontroller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControler {
	// 定义uri
	String uri = "https://api.weixin.qq.com/sns/jscode2session?";
	
	@RequestMapping("/weLogin")
	public String weLogin(String code, String AppID, String AppSecret) throws IOException {
		try {
			// 构造uri
			URL url = new URL(uri + "appid=" + AppID + "&secret="+ AppSecret + "&js_code=" + code + "&grant_type=authorization_code");
			// 实例化一个连接
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			// 设置请求的编码方式
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			// 构造一个流输出
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
			String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();

            return result.toString();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "faild";
	}
	
	@RequestMapping("/setSession")
	public String getOpenId (String openId, HttpServletRequest request) {
		HttpSession session = request.getSession();
		  //获取sessionid
		session.setAttribute("openId", openId);
		return session.getId();
	}
	
	@RequestMapping("/getOpenId")
	public String getOpenId(HttpServletRequest request) {
		System.out.println(request.getSession().getId());
		return request.getSession().getAttribute("openId").toString();
	}
	
}
