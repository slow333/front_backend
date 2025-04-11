package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restapi")
public class RestApiController {
  //########## 1번째 장: RESTfull web service : hogwart #################
  @GetMapping("/00-intro/00-intro")
  public String restLectureIntro() {
    return "restapi/00-intro/00-intro";
  }
  @GetMapping("/00-intro/01-contents")
  public String restLectureContents() {
    return "restapi/00-intro/01-contents";
  }
  @GetMapping("/00-intro/02-intro-spring-boot")
  public String restLectureIntroSpringBoot() {
    return "restapi/00-intro/02-intro-spring-boot";
  }

  //########## 1번째 장: RESTfull web service : 책 내용 정리 중단... #################
  @GetMapping("/01-restfull-web/01-rest-web-basic")
  public String restWebBasic() {
    return "restapi/90-restfull-web/01-rest-web-basic";
  }

  @GetMapping("/01-restfull-web/02-spring-and-rest-api")
  public String restSpringAndRestApi() {
    return "restapi/90-restfull-web/02-spring-and-rest-api";
  }

  @GetMapping("/01-restfull-web/03-OAS")
  public String restOAS() {
    return "restapi/90-restfull-web/03-OAS";
  }
}
