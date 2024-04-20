package dandev.simpleApp.simpleApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleAppApplication.class, args);
	}

	@Controller
	@RequestMapping("/")
	public class resourses{

		@GetMapping
		public String pageHost(){
			return "index";
		}
		@GetMapping("/docker")
		public String pageDocker(){
			return "docker";
		}
		@GetMapping("/compose")
		public String pageCompose(){
			return "compose";
		}
	}
}
