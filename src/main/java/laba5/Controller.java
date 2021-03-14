package laba5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/" )
public class Controller
{
    @GetMapping( "/get" )
    public String get( @RequestParam( name = "code" ) final String code )
    {
        return code;
    }

    @PostMapping( "/post" )
    public int post( @RequestParam( name = "value" ) final int value )
    {
        return value;
    }
}
