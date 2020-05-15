package com.slw.my_user.config;


import lombok.extern.slf4j.Slf4j;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.FlywayException;
import org.flywaydb.core.api.configuration.FluentConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//@Slf4j
@Configuration
public class FlywayConfig {
    Logger logger = LoggerFactory.getLogger(FlywayConfig.class);

    @Autowired
    private DataSource dataSource;

    @Bean
    public void initEnviroment() {
//        new DriverDataSource()
//        DriverDataSource.DriverType.POSTGRESQL
        try {
            FluentConfiguration configuration = getFlywayConfiguration();
            configuration.baselineOnMigrate(true);
            configuration.baselineDescription("INIT START");
            Flyway flyway = configuration.load();
            flyway.migrate();
        } catch (FlywayException e) {

        }
    }

    @Bean
    public void upgradeEnviroment() {
        try {
            FluentConfiguration configuration = getFlywayConfiguration();
            Flyway flyway = configuration.load();
            flyway.clean();
            flyway.migrate();
            logger.info(" flyway 升级数据库哦 ! ");
        } catch (FlywayException e) {
            logger.info(" flyway 数据写入失败 : {}", e.getMessage());
        }
    }

    private FluentConfiguration getFlywayConfiguration() {
        FluentConfiguration configuration = Flyway.configure().dataSource(dataSource);
        configuration.schemas("s_user", "public");
        configuration.defaultSchema("s_user");
        configuration.table("schema_version");
        return configuration;
    }
}
