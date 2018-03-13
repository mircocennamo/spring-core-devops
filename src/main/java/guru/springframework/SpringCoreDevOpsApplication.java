package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreDevOpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDevOpsApplication.class, args);

		//this is a whitespace change test
		// another test...
        //TEST CI Jenkins
        // TEST payload url http://54.194.156.240:8080/github-webhook/
        // fa una push su jenkins che fa partire la build  (push)
	}
}
