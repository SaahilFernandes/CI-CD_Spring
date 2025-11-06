package com.example.ci_cd_spring;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloControllerTest {
    @Test
    void helloReturnsString() {
        HelloController ctrl = new HelloController();
        assertThat(ctrl.hello()).contains("Hello");
    }
}
