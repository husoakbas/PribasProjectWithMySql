package com.akbas.springboot.PribasProject.TimelineController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.akbas.springboot.PribasProject.DTO.TimelineResponse;
import com.akbas.springboot.PribasProject.Entity.Timeline;
import com.akbas.springboot.PribasProject.TimelineService.TimelineService;

@RestController
@RequestMapping("/api/pribaswb")
public class TimelineController {

	@Autowired
	TimelineService timelineService;

	@PostMapping("/create")
	public Timeline createTimelineController(@RequestBody Timeline timeline) { // yeni kayıt atar.
		return timelineService.createTimelineService(timeline);
	}

	@GetMapping("/all")
	public List<Timeline> getAllTimeline() { // bütün kayıtları döner.
		return timelineService.getAllTimelineService();
	}

	@DeleteMapping("/deleteTimeline/{id}")
	public void deleteTimelineController(@PathVariable int id) {//id'ye göre siler
		timelineService.deleteTimelineService(id);
	}

	@PutMapping("/update")
	public void updateTimelineController(@RequestBody Timeline timeline) {//update atar
		timelineService.updateTimelineService(timeline);
	}

	@GetMapping("/join")
	public List<TimelineResponse> getJoinTimelineController() {//join query
		return timelineService.getJoinTimelineService();
	}

}
