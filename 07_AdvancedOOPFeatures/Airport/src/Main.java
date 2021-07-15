import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = new GregorianCalendar();
        Date date1 = new Date(System.currentTimeMillis() + 10800000);



        Airport airport = Airport.getInstance();
        List <Terminal> terminals = airport.getTerminals();

        terminals.stream()
                .map(Terminal::getFlights) // Делаем map из Flight
                .flatMap(Collection::stream) // flights -> flights.stream() // Сливаем все Flight в один map
                .filter(flight -> flight.getType() == Flight.Type.DEPARTURE) // Фильтруем по типу вылета
                .filter(flight -> flight.getDate().after(date) && flight.getDate().before(date1)) //Фильтруем по времени вылета
                .sorted(Comparator.comparing(Flight::getDate)) // Сортируем по времени вылета
                .forEach(flight -> System.out.println(flight + " " + flight.getAircraft())); // Печатаем
    }
}
