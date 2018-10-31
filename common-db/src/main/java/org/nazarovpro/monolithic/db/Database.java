package org.nazarovpro.monolithic.db;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("org.nazarovpro.monolithic.db")
@EntityScan
@EnableJpaRepositories
@EnableTransactionManagement
public class Database {

    @Configuration
    @Profile("default")
    @PropertySource({"classpath:db_local.properties"})
    class LocalProfile{

    }

    @Configuration
    @Profile("prod")
    @PropertySource({"classpath:db_prod.properties"})
    class ContainerProfile{

    }

    @Configuration
    @Profile("test")
    @PropertySource({"classpath:db_test.properties"})
    class TestContainerProfile{

    }

}
