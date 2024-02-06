package com.dullaz.seleniumdrivertest

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ChromeDriverConfig {

  @Bean(destroyMethod = "quit")
  fun chromeDriver(): ChromeDriver {
    val options = ChromeOptions()
    options.addArguments("--headless=new")
    return ChromeDriver(options)
  }

}
