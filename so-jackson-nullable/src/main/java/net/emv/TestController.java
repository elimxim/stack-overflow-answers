package net.emv;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {

    @Getter
    @Builder
//    @JsonSerialize(using = TestResponseJsonSerializer.class)
    public static class TestResponse {
        @JsonSerialize(nullsUsing = NullableStringJsonSerializer.class)
        private String firstField;
        @JsonSerialize(nullsUsing = NullableStringJsonSerializer.class)
        private String secondField;
    }

    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TestResponse> test() {
        return ResponseEntity.ok(TestResponse.builder()
                .firstField(null)
                .secondField("second")
                .build());
    }
}
