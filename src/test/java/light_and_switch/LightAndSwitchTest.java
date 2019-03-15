package light_and_switch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LightAndSwitchTest {

    @Test
    void theSwitchStartsOff() {
        CircuitSwitch circuitSwitch = new CircuitSwitch();

        assertThat(circuitSwitch.state()).isEqualTo(SWITCH_STATE.OFF);
    }

    @Test
    void bothLightsStartsOff() {
        CircuitSwitch circuitSwitch = new CircuitSwitch();

        assertThat(circuitSwitch.getLight1().state()).isEqualTo(LIGHT_STATE.OFF);
        assertThat(circuitSwitch.getLight2().state()).isEqualTo(LIGHT_STATE.OFF);
    }

    @Test
    void theSwitchCanBeTurnedOn() {
        CircuitSwitch circuitSwitch = new CircuitSwitch();
        circuitSwitch.turnOn();

        assertThat(circuitSwitch.state()).isEqualTo(SWITCH_STATE.ON);
    }

    @Test
    void whenTheSwitchIsTurnedOn_bothLightsAreTurnedOn() {
        CircuitSwitch circuitSwitch = new CircuitSwitch();
        circuitSwitch.turnOn();

        assertThat(circuitSwitch.getLight1().state()).isEqualTo(LIGHT_STATE.ON);
        assertThat(circuitSwitch.getLight2().state()).isEqualTo(LIGHT_STATE.ON);
    }

    @Test
    void givenAnSwitchInAnOnState_itCanBeTurnedOff() {
        CircuitSwitch circuitSwitch = new CircuitSwitch();
        circuitSwitch.turnOn();
        circuitSwitch.turnOff();

        assertThat(circuitSwitch.state()).isEqualTo(SWITCH_STATE.OFF);
    }

    @Test
    void givenAnSwitchInAnOnState_itCanBeTurnedOff_and_bothLightsWillBeOff() {
        CircuitSwitch circuitSwitch = new CircuitSwitch();
        circuitSwitch.turnOn();
        circuitSwitch.turnOff();

        assertThat(circuitSwitch.getLight1().state()).isEqualTo(LIGHT_STATE.OFF);
        assertThat(circuitSwitch.getLight2().state()).isEqualTo(LIGHT_STATE.OFF);
    }
}
