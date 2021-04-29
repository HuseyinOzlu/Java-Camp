package Kodlamaio;

public class Instructor extends User {
	private int videoId;
	private String videoName;
	private String videoInfo;
	private int homeworkId;
	private String homeworkName;
	private String addCourse;
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public String getVideoInfo() {
		return videoInfo;
	}
	public void setVideoInfo(String videoInfo) {
		this.videoInfo = videoInfo;
	}
	public int getHomeworkId() {
		return homeworkId;
	}
	public void setHomeworkId(int houseworkId) {
		this.homeworkId = houseworkId;
	}
	public String getHomeworkName() {
		return homeworkName;
	}
	public void setHomeworkName(String homeworkName) {
		this.homeworkName = homeworkName;
	}
	public String getAddCourse() {
		return addCourse;
	}
	public void setAddCourse(String addCourse) {
		this.addCourse = addCourse;
	}

}
