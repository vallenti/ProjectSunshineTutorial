package bg.val.projectsunshine.app;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
//        JSONObject jsonObject = new JSONObject(weatherJsonStr);
//        JSONArray list = jsonObject.getJSONArray("list");
//        JSONObject day = list.getJSONObject(dayIndex);
//        JSONObject temp = day.getJSONObject("temp");
//        double d = temp.getDouble("max");

        double result = new JSONObject(weatherJsonStr)
                .getJSONArray("list")
                .getJSONObject(dayIndex)
                .getJSONObject("temp")
                .getDouble("max");

        return result;
    }

}