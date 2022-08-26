package com.akbas.springboot.PribasProject.TimelineService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akbas.springboot.PribasProject.DTO.TimelineResponse;
import com.akbas.springboot.PribasProject.Entity.Timeline;
import com.akbas.springboot.PribasProject.Repository.MomentsRepository;
import com.akbas.springboot.PribasProject.Repository.TagsRepository;
import com.akbas.springboot.PribasProject.Repository.TimelineRepository;
import com.akbas.springboot.PribasProject.Repository.UsersRepository;

@Service
public class TimelineService {

	@Autowired
	TimelineRepository timelineRepository;

	@Autowired
	UsersRepository usersRepository;

	@Autowired
	MomentsRepository momentsRepository;

	@Autowired
	TagsRepository tagsRepository;

	public Timeline createTimelineService(Timeline timeline) {
		return timelineRepository.save(timeline);

	}

	public List<Timeline> getAllTimelineService() {
		return timelineRepository.findAll();
	}

	public void deleteTimelineService(int id) {
		timelineRepository.deleteById(id);
	}

	public List<TimelineResponse> getJoinTimelineService() {
		return timelineRepository.getJoionExample();
	}

	public Timeline updateTimelineService(Timeline timeline) {
		return timelineRepository.save(timeline);
	}

}