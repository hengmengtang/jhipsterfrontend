package com.mengtang.application.cucumber.stepdefs;

import com.mengtang.application.JhipsterfrontendApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterfrontendApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
