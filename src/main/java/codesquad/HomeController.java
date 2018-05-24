package codesquad;

import codesquad.exceptions.UnauthorizedRequestException;
import codesquad.model.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/")
    public String showHome(Model model) {
        throw new UnauthorizedRequestException("error message");
        //model.addAttribute("questions", questionRepository.findQuestionsByDeletedFalseOrderByQuestionIdDesc());
        //return "index";
    }
}