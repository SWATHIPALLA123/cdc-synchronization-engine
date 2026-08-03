package com.example.cdc.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DebeziumConfig {

    /*
     * Debezium Connector Configuration
     *
     * Connector Name : postgres-connector
     * Database       : cdc_db
     * Plugin         : pgoutput
     * Kafka Topics   :
     *      orders
     *      customers
     *      products
     *      inventory
     *
     * Actual connector configuration
     * will be added inside docker-compose
     * using Kafka Connect.
     */

}