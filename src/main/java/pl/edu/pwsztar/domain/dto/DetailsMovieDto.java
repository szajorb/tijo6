package pl.edu.pwsztar.domain.dto;


import javax.persistence.criteria.CriteriaBuilder;

public class DetailsMovieDto {
    private Long movieId;
    private String title;
    private String image;
    private Integer year;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
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

    private String videoId;

    public DetailsMovieDto() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoId() {
        return videoId;
    }

    @Override
    public String toString() {
        return "DetailsMovieDto{" +
                "movieId=" + movieId +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }
}