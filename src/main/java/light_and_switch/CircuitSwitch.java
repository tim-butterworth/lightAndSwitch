package light_and_switch;

public class CircuitSwitch {

    private SWITCH_STATE state = SWITCH_STATE.OFF;
    private Light light = new Light();

    public SWITCH_STATE state() {
        return state;
    }

    public Light getLight() {
        return light;
    }

    public void turnOn() {
        state = SWITCH_STATE.ON;

        light.turnOn();
    }

    public void turnOff() {
        state = SWITCH_STATE.OFF;

        light.turnOff();
    }
}
