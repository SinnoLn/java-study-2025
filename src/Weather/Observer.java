package Weather;

import java.util.Observable;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
