package com.john_cd;

import software.amazon.awscdk.core.App;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;
// import org.hamcrest.CoreMatchers;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestInfraTest {

    private final static ObjectMapper JSON =
            new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true);

    @Test
    public void testStack() throws IOException {
        App app = new App();
        TestInfraStack stack = new TestInfraStack(app, "test");

        // synthesize the stack to a CloudFormation template and compare against
        // a checked-in JSON file.
        JsonNode actual = JSON.valueToTree(app.synth().getStackArtifact(stack.getArtifactId()).getTemplate());
        assertEquals(new ObjectMapper().createObjectNode(), actual);
        // example test: 
        // assertThat(actual.toString(), CoreMatchers.both(CoreMatchers.containsString("AWS::SQS::Queue")).and(CoreMatchers.containsString("AWS::SNS::Topic")));
    }
}
