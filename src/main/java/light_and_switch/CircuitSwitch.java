package light_and_switch;

public class CircuitSwitch {

    private SWITCH_STATE state = SWITCH_STATE.OFF;
    private Light light1 = new Light();
    private Light light2 = new Light();

    public SWITCH_STATE state() {
        return state;
    }

    public Light getLight1() {
        return light1;
    }

    public void turnOn() {
        state = SWITCH_STATE.ON;

        light1.turnOn();
        light2.turnOn();
    }

    public void turnOff() {
        state = SWITCH_STATE.OFF;

        light1.turnOff();
        light2.turnOff();
    }

    public Light getLight2() {
        return light2;
    }
}
