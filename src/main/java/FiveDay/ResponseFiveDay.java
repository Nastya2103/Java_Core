package FiveDay;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponseFiveDay {
    @JsonProperty("Headline")
    public Headline headline;
    @JsonProperty("DailyForecasts")
    public ArrayList<DailyForecast> dailyForecasts;

    public ResponseFiveDay(String string, String string1, String string2, double aDouble) {
    }

    public ResponseFiveDay() {
    }

    public String toString() {
        return " " + dailyForecasts;
    }
}
