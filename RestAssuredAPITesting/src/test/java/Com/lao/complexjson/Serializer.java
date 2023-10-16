package Com.lao.complexjson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer { 

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		SuperHeroMoviesAndTVSeries  heroMoviesAndTVSeries = 
				new SuperHeroMoviesAndTVSeries();

		heroMoviesAndTVSeries.setCategory("Super Hero Movies & TV Series");

		List<String> accpectedFranchies = new ArrayList<String>();
		accpectedFranchies.add("DC");
		accpectedFranchies.add("Marvel");

		heroMoviesAndTVSeries.setAcceptedFranchises(accpectedFranchies);

		List<String> geners = new ArrayList<String>();
		geners.add("Action");
		geners.add("Adventure");
		geners.add("Heroic");
		geners.add("Dark");
		geners.add("Funny");

		heroMoviesAndTVSeries.setGenres(geners);

		List<Movies> allmovies = new ArrayList<>();
		List<TVSeries>allTVseries = new ArrayList<>();


		Movies batman = new Movies();
		batman.setTitle("Batman: The Dark knigth");
		batman.setYear(2008);
		allmovies.add(batman);

		List<String> batmancast = new ArrayList<>();

		batmancast.add("Christian Bale");
		batmancast.add("Heath Ledger");

		batman.setCast(batmancast);


		Movies jl= new Movies();
		jl.setTitle("Justice League : Snyder Cut");
		jl.setYear(2021);
		allmovies.add(jl);

		List<String> jlcast = new ArrayList<>();

		jlcast.add("Henry Cavill");
		jlcast.add("Gal Gadot");

		jl.setCast(jlcast);

		Movies AvengersAOU= new Movies();
		AvengersAOU.setTitle("Avengers: Age of Ultron");
		AvengersAOU.setYear(2015);
		allmovies.add(AvengersAOU);

		List<String> AOUcast = new ArrayList<>();

		AOUcast.add("Robert Downey Jr.");
		AOUcast.add("Chris Evans");

		AvengersAOU.setCast(AOUcast);



		Movies avengers= new Movies();
		avengers.setTitle("The Avengers");
		avengers.setYear(2012);
		allmovies.add(avengers); 

		List<String>avengerscast = new ArrayList<>();

		avengerscast.add("Chris Evans");
		avengerscast.add("ChrisHemsworth");

		avengers.setCast(avengerscast);

		TVSeries flash = new TVSeries();
		flash.setTitle("Flash");
		flash.setYears(2014);
		allTVseries.add(flash);

		TVSeries gotham = new TVSeries();
		gotham.setTitle("Gotham");
		gotham.setYears(2014);
		allTVseries.add(gotham);


		TVSeries SuperGirl = new TVSeries();
		SuperGirl.setTitle("Super Girl");
		SuperGirl.setYears(2014);
		allTVseries.add(SuperGirl);


		OtherDetails details = new OtherDetails();
		details.setCountry("Only USA, Engaluku verengum kilagal Kidayathu");
		details.setLanguage("Alien ah irunthalum English Karanda");

		heroMoviesAndTVSeries.setMovies(allmovies);
		heroMoviesAndTVSeries.setTvSeries(allTVseries);
		heroMoviesAndTVSeries.setOtherDetails(details);


		ObjectMapper mapper = new ObjectMapper();

		File superjson = new File("complex.json");

		mapper.writerWithDefaultPrettyPrinter().writeValue(superjson,heroMoviesAndTVSeries );













	}

}
