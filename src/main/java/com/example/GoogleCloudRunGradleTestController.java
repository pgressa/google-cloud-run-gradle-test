package com.example;

import io.micronaut.http.annotation.*;

@Controller("/googleCloudRunGradleTest")
public class GoogleCloudRunGradleTestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}