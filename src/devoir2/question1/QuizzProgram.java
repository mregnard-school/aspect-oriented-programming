package devoir2.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("devoir2.question1")
public class QuizzProgram {

  @Bean
  public QuizzMaster quizzMaster() {
    //On change ici la valeur du bean qui sera injecté
    return new CMMQuizz();
  }

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(QuizzProgram.class);
    QuizzMasterServiceWithConstructor service = context.getBean(QuizzMasterServiceWithConstructor.class);
    QuizzMasterServiceWithSetter serviceWithSetter = context.getBean(QuizzMasterServiceWithSetter.class);

    //service.run();
    serviceWithSetter.run();
  }
}