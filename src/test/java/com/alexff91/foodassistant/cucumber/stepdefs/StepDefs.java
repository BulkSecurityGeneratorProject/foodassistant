package com.alexff91.foodassistant.cucumber.stepdefs;

import com.alexff91.foodassistant.FoodassistantApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FoodassistantApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
