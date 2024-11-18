package com.utk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.utk.model", "com.utk.main" }) // base package classes or base package path can be
																	// given here
public class ProjectConfig {


}
