package com.example;

import java.time.*;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Timer trigger.
 */
public class TimerTriggerFunction {
	/**
	 * This function will be invoked periodically according to the specified
	 * schedule.
	 * 
	 * @throws IOException
	 */
	@FunctionName("TimerTrigger-Java")
	public void run(@TimerTrigger(name = "timerInfo", schedule = "%TIMER_SCHEDULE%") String timerInfo,
			final ExecutionContext context) throws IOException {
		context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
//		GenerateCSV.generateCSVReport();
//		ReadProperties_Value.readPropValues();

	}

	

}
