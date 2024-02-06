package com.dullaz.seleniumdrivertest

import org.openqa.selenium.chrome.ChromeDriver
import org.springframework.stereotype.Service

@Service
class TestService(
  private val chromeDriver: ChromeDriver
) {

  fun test() {
    chromeDriver.get("https://www.google.com")
  }

}
