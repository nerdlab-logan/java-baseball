package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest {

  private Application application;

  @BeforeEach
  public void setUp() {
    application = new Application();
  }

  @Test public void testAppHasAGreeting() {

    assertThat(application.getGreeting()).startsWith("Hello");
  }
}