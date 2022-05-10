import MovieScore from "components/MovieScore";
import { Link } from "react-router-dom";

function MovieCard() {
    const movie = {
        id: 1,
        image: "https://br.web.img3.acsta.net/pictures/19/11/29/17/57/5161763.jpg",
        title: "The Witcher",
        count: 2,
        score: 4.5
    };
    return (

        <div>
            <img className="dsmovie-movie-card-image" src={movie.image} alt={movie.title} />
            <div className="dsmovie-card-bottom-container">
                <h3>{movie.title}</h3>
                <MovieScore/>

               <Link to={`/form/${movie.id}`}>
                <div className="btn btn-primary dsmovie-btn">Avaliar</div>
                   
                   </Link> 
            </div>
        </div>
    );

}
export default MovieCard;