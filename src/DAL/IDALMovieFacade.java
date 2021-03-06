package DAL;


import BE.Category;
import BE.Movie;
import BLL.Exceptions.CategoryDAOException;

import java.sql.Date;
import java.util.List;

public interface IDALMovieFacade {

    List<Category> getAllCategories() throws Exception;
    Category createCategory(String categoryName) throws Exception;
    void deleteCategory(Category categoryToDelete) throws Exception;
    List<Movie> getAllMovies() throws Exception;
    public Movie createMovie(String name, float rating, String fileLink, Date lastView, float imdb) throws Exception;
    void deleteMovie(Movie movieToDelete) throws Exception;
    Movie getMovie(int id) throws Exception;

    public List<Movie> getCategoryMovie(int id) throws Exception;
    public void addToCategory(Category selectedCategory, Movie selectedMovie) throws Exception;
    public void removeFromCategory(Category selectedCatagory, Movie selectedMovie) throws Exception;
    public void removeFromCat(Category selectedItem) throws Exception;
    public void removeMoviesFromCat(Movie selectedItem) throws Exception;

    void updateMovieRating(Movie movie) throws Exception;
    void updateMovieLastView(Movie selectedItem)throws Exception;
}
