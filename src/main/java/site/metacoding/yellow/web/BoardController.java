package site.metacoding.yellow.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.yellow.domain.Board;

//@RrestController 은 데이터로 줘 
@Controller // Board 테이블의 데이터를 view로줘
public class BoardController {
	@GetMapping("/board")
	public String getBoard(Model model) {
		// 더미 데이터 (가짜 데이터)
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board (1, "스프링1강", "컨트롤러배우기"));
		boardList.add(new Board (2, "스프링2강", "템플릿 엔진 배우기"));
		boardList.add(new Board (3, "스프링3강", "디비 연결 하기 "));
		model.addAttribute("boards", boardList);
		return "board/list";
	}
	//---------------------------
	@GetMapping("/board/{id}")
	public String getBoard(@PathVariable Integer id,Model model) {
		// 더미 데이터
		List<Board> boardList = new ArrayList<>();
		boardList.add(new Board (1, "스프링1강", "컨트롤러배우기"));
		boardList.add(new Board (2, "스프링2강", "템플릿 엔진 배우기"));
		boardList.add(new Board (3, "스프링3강", "디비 연결 하기 "));
		
		//만약 아이디가 1이면 1, 2면 2
		if(id == 1) {
			model.addAttribute("boards",boardList.get(0));
		}
		if(id == 2) {
			model.addAttribute("boards",boardList.get(1));
		}
		if(id ==3) {
			model.addAttribute("boards",boardList.get(2));
		}
		return "board/detail";
	}
}	
