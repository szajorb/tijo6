package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;


@Component
public class MovieDetailsMapper {

    public DetailsMovieDto mapToDto(Movie movie) {
        DetailsMovieDto detailsMovieDto = new DetailsMovieDto();

        detailsMovieDto.setTitle(movie.getTitle());
        detailsMovieDto.setImage(movie.getImage());
        detailsMovieDto.setYear(movie.getYear());
        detailsMovieDto.setVideoId(movie.getVideoId());

        return detailsMovieDto;
    }

}

