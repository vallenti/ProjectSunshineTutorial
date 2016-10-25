package bg.val.projectsunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> forecasts = new ArrayList<>();
        forecasts.add("Today - Sunny - 88/63");
        forecasts.add("Tomorrow - Foggy - 70/46");
        forecasts.add("Weds - Cloudy - 88/63");
        forecasts.add("Thurs - Rainy - 88/63");
        forecasts.add("Fri - Foggy - 88/63");
        forecasts.add("Sat - Sunny - 88/63");
        forecasts.add("Sat - Sunny - 88/63");
        forecasts.add("Sat - Sunny - 88/63");
        forecasts.add("Sat - Sunny - 88/63");
        forecasts.add("Sat - Sunny - 88/63");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecasts);
        ListView forecastListView = (ListView)rootView.findViewById(R.id.listview_forecast);
        forecastListView.setAdapter(adapter);
        return rootView;
    }
}
