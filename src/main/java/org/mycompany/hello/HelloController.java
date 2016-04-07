package org.mycompany.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by boris on 4/6/2016.
 */
@RestController
@RequestMapping(value = "/helloworld")
public class HelloController
{
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Hello hello(@RequestParam(value = "textField", defaultValue = "Hello, World!!!") String message)
    {
        return new Hello(message);
    }

}
