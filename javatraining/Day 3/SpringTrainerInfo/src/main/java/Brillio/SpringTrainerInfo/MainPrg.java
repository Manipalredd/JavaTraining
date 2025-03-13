package Brillio.SpringTrainerInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Trainer.xml");
			Trainer trainer = (Trainer)ctx.getBean("beanTrainerPrasanna");
			trainer.showInfo();
	}

}
