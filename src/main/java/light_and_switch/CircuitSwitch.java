package light_and_switch;

import java.util.List;

public class CircuitSwitch {

    private SWITCH_STATE state = SWITCH_STATE.OFF;
    private final List<Light> lights;

    public CircuitSwitch(List<Light> lights) {
        this.lights = lights;
    }

    public SWITCH_STATE state() {
        return state;
    }

    public void turnOn() {
        state = SWITCH_STATE.ON;

        lights.forEach(Light::turnOn);
    }

    public void turnOff() {
        state = SWITCH_STATE.OFF;

        lights.forEach(Light::turnOff);
    }

}
