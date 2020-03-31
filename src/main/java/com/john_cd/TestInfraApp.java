package com.john_cd;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Environment;

public class TestInfraApp {

    // Helper method to build an environment
    static Environment makeEnv(String account, String region) {
        return Environment.builder()
                .account(account)
                .region(region)
                .build();
    }


    public static void main(final String[] args) {
        App app = new App();

        // Environment envEU = makeEnv("8373873873", "eu-west-1");
        // Environment envUSA = makeEnv("2383838383", "us-west-2");

        new TestInfraStack(app, "test-infra-stack");

        app.synth();
    }
}
