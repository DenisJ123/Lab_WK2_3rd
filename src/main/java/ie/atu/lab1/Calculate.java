package ie.atu.lab1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

    @GetMapping("/calculate")
    public String calculate(@RequestParam String operation, @RequestParam int fnum, @RequestParam int snum) {
        double result;

        if ("add".equalsIgnoreCase(operation)) {
            result = fnum + snum;
            return "Sum: " + result;
        } else if ("subtract".equalsIgnoreCase(operation)) {
            result = fnum - snum;
            return "Answer: " + result;
        } else if ("multiply".equalsIgnoreCase(operation)) {
            result = fnum * snum;
            return "Answer: " + result;
        } else if ("divide".equalsIgnoreCase(operation)) {
            if (snum == 0) {
                return "Cannot divide by 0";
            }
            result = (double) fnum / snum;
            return "Answer: " + result;
        } else {
            return "Invalid";
        }
    }
}

