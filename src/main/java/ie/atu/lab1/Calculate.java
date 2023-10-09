package ie.atu.lab1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

    @GetMapping("/calculate")
    public String calculate(@RequestParam String operation, @RequestParam int fnum, @RequestParam int snum) {
        int result;

        if ("add".equalsIgnoreCase(operation)) {
            result = fnum + snum;
            return "Sum: " + result;
        } else if ("subtract".equalsIgnoreCase(operation)) {
            result = fnum - snum;
            return "Difference: " + result;
        } else {
            return "Invalid operation. Supported operations are 'add' and 'subtract'.";
        }
    }
}
