package com.sda.study.springbootpractice.configurations;

import com.sda.study.springbootpractice.handlers.AuditorAwareHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Configuration for auditing
 *
 * @author Joozepp
 * @Date 2/27/2023
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class AuditConfiguration {
    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareHandler();
    }
}
