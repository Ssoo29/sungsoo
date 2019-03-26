package test.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import test.model.vo.User;

/**
 * Servlet implementation class TestServlet5
 */
@WebServlet("/t5")
public class TestServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// test5 버튼 클릭시 요청되는 컨트롤러
		int no = Integer.parseInt(request.getParameter("no"));
		System.out.println("t5 : " + no);
		
		ArrayList<User> userList = new ArrayList<>();
		userList.add(new User("u1234", "p1134", "김성수", 30, "ff1@naver.com", "010-1000-0000"));
		userList.add(new User("u2234", "p1234", "김동욱", 31, "ff2@naver.com", "010-2000-0000"));
		userList.add(new User("u3234", "p1334", "안정은", 32, "ff3@naver.com", "010-3000-0000"));
		userList.add(new User("u4234", "p1434", "정민경", 33, "ff4@naver.com", "010-4000-0000"));
		userList.add(new User("u5234", "p1534", "윤석호", 34, "ff5@naver.com", "010-5000-0000"));
		userList.add(new User("u6234", "p1634", "구한모", 35, "ff6@naver.com", "010-6000-0000"));
		
		//전송할 json 객체 준비
		JSONObject sendjson = new JSONObject();
		//리스트 객체들을 저장할 json 배열 객체 준비
		JSONArray jsonArr = new JSONArray();
		
		//리스트(또는 맵)에서 객체를 하나씩 꺼냄
		for(User user :  userList) {
			//꺼낸 user 객체 정보를 저장할 json 객체 준비
			JSONObject userJson = new JSONObject();
			//user 객체가 가진 필드값 한개씩 꺼내서
			//jsonUser에 옮겨 기록 저장하기
			userJson.put("userid", user.getUserid());
			userJson.put("userpwd", user.getUserPwd());
			//json에서 한글 깨짐을 막으려면,
			//java.net.URLEncoder의 encode() 메소드로
			//한글은 인코딩처리해야 함
			userJson.put("username", URLEncoder.encode(user.getUserName(), "UTF-8"));
			userJson.put("age", user.getAge());
			userJson.put("email", user.getEmail());
			userJson.put("phone", user.getPhone());
			
			//json 객체를 json 배열에 기록저장
			jsonArr.add(userJson);
		}
		
		//json 배열은 전송할 수 없음.
		//전송용 json 객체에 json 배열을 저장함.
		sendjson.put("list", jsonArr);
		System.out.println("t5 : " + sendjson.toJSONString());
		
		//내보내기 : ajax 통신은 출력스트림 필요
		response.setContentType("application/json; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(sendjson.toJSONString());
		out.flush();
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
