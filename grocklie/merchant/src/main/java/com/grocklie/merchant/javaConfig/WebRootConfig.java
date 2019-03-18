package com.grocklie.merchant.javaConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(WebMvcConfig.class)
public class WebRootConfig {

}
