package cn.iutils.task;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class TaskTest {

	public final Logger log = Logger.getLogger(this.getClass());

	public void run() {
		for (int i = 0; i < 1; i++) {
			log.debug(i + " run......................................" + (new Date()));
		}

	}
}
