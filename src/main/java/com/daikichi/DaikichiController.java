package com.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		String fortune = "";
		if (number % 2 == 0) {
			fortune = "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else if (number % 2 != 0) {
			fortune = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		return fortune;
	}
	
	@RequestMapping("/travel/{destination}")
	public String travelDestination(@PathVariable("destination") String destination) {
		return "Congratulations! You will soon travel to " + destination + "!";
	}
}
