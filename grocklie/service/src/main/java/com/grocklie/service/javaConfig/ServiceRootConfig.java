package com.grocklie.service.javaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistenceConfig.class})
public class ServiceRootConfig {

}
