package com.ms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvroController {

    @Autowired
    private AvroProducer avroProducer;

    @GetMapping("/test")
//    public String producerAvroMessage(@PathVariable int id, @PathVariable String firstName, @PathVariable String lastName) {
        public String producerAvroMessage() {
        avroProducer.produceEmployeeDetails(1, "Tahir", "lastName");
        return "Sent employee details to consumer";
    }

}
