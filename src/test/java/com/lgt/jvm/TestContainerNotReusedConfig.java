package com.lgt.jvm;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.containers.wait.strategy.HttpWaitStrategy;
import org.testcontainers.utility.DockerImageName;

import java.time.Duration;


@TestConfiguration
public abstract class TestContainerNotReusedConfig {
    private static final Network network = Network.newNetwork();

    public TestContainerNotReusedConfig() {
    }

    /*
    @Container
    static PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>(DockerImageName.parse("postgres:16.3"))
            .withNetwork(network)
                .withNetworkAliases("postgres");

    @Container
    static KafkaContainer kafkaContainer = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.6.1"))
            .withNetwork(network)
            .withNetworkAliases("postgres");

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer(DockerImageName.parse("postgres:16.3"));
    }


     */

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer(DockerImageName.parse("postgres:16.3"));
    }
/*
    //@Bean
    public KafkaContainer kafkaContainer() {
        KafkaContainer kafkaContainer = new KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:7.6.1"))
                .withNetwork(network)
                .withNetworkAliases("kafka")
                ;
kafkaContainer.start();
        return kafkaContainer;
    }


    //@Bean
    //@DependsOn({"postgreSQLContainer", "kafkaContainer"})
    public GenericContainer<?> appContainer(PostgreSQLContainer<?> postgreSQLContainer, KafkaContainer kafkaContainer) {
            System.out.println("BootstrapServers READY --->>>"+kafkaContainer.getBootstrapServers());


            String format = String.format("jdbc:postgresql://postgres:%d",
                    postgreSQLContainer.getMappedPort(PostgreSQLContainer.POSTGRESQL_PORT));
            System.out.println("DB "+format);
            String test = "jdbc:postgresql://192.168.1.129:54321/postgres";
            String test1 = "jdbc:postgresql://192.168.1.129:"+postgreSQLContainer.getMappedPort(PostgreSQLContainer.POSTGRESQL_PORT)+"/test";
            String test2 = "jdbc:postgresql://postgres:"+postgreSQLContainer.getMappedPort(PostgreSQLContainer.POSTGRESQL_PORT)+"/test";
            String format1 = String.format(test, postgreSQLContainer.getMappedPort(PostgreSQLContainer.POSTGRESQL_PORT));

        Integer mappedPort = kafkaContainer.getMappedPort(KafkaContainer.KAFKA_PORT);
        System.out.println("Kafka port:"+mappedPort);

        System.out.println("DB1 "+format1);

        GenericContainer<?> container = new GenericContainer<>(DockerImageName.parse("com.blanksystem/blank-service:1.0.0-alpha"))
                .withExposedPorts(8185)
                .withNetwork(network)
                .withEnv("SPRING_DATASOURCE_URL", String.format("jdbc:postgresql://postgres:%d/test", PostgreSQLContainer.POSTGRESQL_PORT))
                .withEnv("SPRING_DATASOURCE_USERNAME", "test")
                .withEnv("SPRING_DATASOURCE_PASSWORD", "test")
                .withEnv("KAFKA-CONFIG_BOOTSTRAP-SERVERS", "PLAINTEXT://kafka:" + KafkaContainer.KAFKA_PORT)
                .waitingFor(new HttpWaitStrategy()
                        .forPath("/actuator/health")
                        .forPort(8185)
                        .withStartupTimeout(Duration.ofMinutes(2)))
        ;
            container.start();
            return container;

    }
*/

    /*@Container
    static WireMockContainer wiremockServer = new WireMockContainer("wiremock/wiremock:3.3.1")
            .withMappingFromResource("placeholder", "wiremock/placeholder/user-get.json");


    @DynamicPropertySource
    static void configureProperties(DynamicPropertyRegistry registry) {
        Startables.deepStart(wiremockServer).join();
        registry.add("third.jsonplaceholder.url", wiremockServer::getBaseUrl);
    }*/
}
