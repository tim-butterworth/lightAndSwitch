package light_and_switch;

public class Light {

    private LIGHT_STATE state = LIGHT_STATE.OFF;

    public LIGHT_STATE state() {
        return state;
    }

    public void turnOn() {
        state = LIGHT_STATE.ON;
    }

    public void turnOff() {
        state = LIGHT_STATE.OFF;
    }
}
