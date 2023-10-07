package net.emv;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class TestResponseJsonSerializer extends JsonSerializer<TestController.TestResponse> {
    @Override
    public void serialize(TestController.TestResponse value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value != null) {
            gen.writeStartObject();
            gen.writeFieldName("firstField");
            gen.writeString(value.getFirstField() != null ? value.getFirstField() : "");
            gen.writeFieldName("secondField");
            gen.writeString(value.getSecondField() != null ? value.getSecondField() : "");
            gen.writeEndObject();
        }
    }
}
