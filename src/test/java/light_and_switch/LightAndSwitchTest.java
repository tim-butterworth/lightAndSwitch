package light_and_switch;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LightAndSwitchTest {

    @Test
    void theSwitchStartsOff() {
        CircuitSwitch circuitSwitch = new CircuitSwitch(Collections.emptyList());

        assertThat(circuitSwitch.state()).isEqualTo(SWITCH_STATE.OFF);
    }

    @Test
    void bothLightsStartsOff() {
        List<Light> lights = Arrays.asList(new Light(), new Light());

        new CircuitSwitch(lights);

        assertThat(lights).hasSize(2);
        for (Light light : lights) {
            assertThat(light).isNotNull();
            assertThat(light.state()).isEqualTo(LIGHT_STATE.OFF);
        }
    }

    @Test
    void theSwitchCanBeTurnedOn() {
        CircuitSwitch circuitSwitch = new CircuitSwitch(Collections.emptyList());
        circuitSwitch.turnOn();

        assertThat(circuitSwitch.state()).isEqualTo(SWITCH_STATE.ON);
    }

    @Test
    void whenTheSwitchIsTurnedOn_bothLightsAreTurnedOn() {
        List<Light> lights = Arrays.asList(new Light(), new Light());

        CircuitSwitch circuitSwitch = new CircuitSwitch(lights);
        circuitSwitch.turnOn();

        assertThat(lights).hasSize(2);
        for (Light light : lights) {
            assertThat(light).isNotNull();
            assertThat(light.state()).isEqualTo(LIGHT_STATE.ON);
        }
    }

    @Test
    void givenAnSwitchInAnOnState_itCanBeTurnedOff() {
        CircuitSwitch circuitSwitch = new CircuitSwitch(Collections.emptyList());
        circuitSwitch.turnOn();
        circuitSwitch.turnOff();

        assertThat(circuitSwitch.state()).isEqualTo(SWITCH_STATE.OFF);
    }

    @Test
    void givenAnSwitchInAnOnState_itCanBeTurnedOff_and_bothLightsWillBeOff() {
        List<Light> lights = Arrays.asList(new Light(), new Light());
        CircuitSwitch circuitSwitch = new CircuitSwitch(lights);
        circuitSwitch.turnOn();
        circuitSwitch.turnOff();

        assertThat(lights).hasSize(2);
        for (Light light : lights) {
            assertThat(light).isNotNull();
            assertThat(light.state()).isEqualTo(LIGHT_STATE.OFF);
        }
    }
}
