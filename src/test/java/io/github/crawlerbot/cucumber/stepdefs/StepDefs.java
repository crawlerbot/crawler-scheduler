package io.github.crawlerbot.cucumber.stepdefs;

import io.github.crawlerbot.CrawlerSchedulerApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CrawlerSchedulerApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
