package pl.edu.pwsztar.domain.dto;


public class UpdateMovieDto {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    private String image;
    private Integer year;
    private String videoId;

    public UpdateMovieDto(){
    }

    @Override
    public String toString() {
        return "UpdateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }
}
