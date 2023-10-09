package ie.atu.lab1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

    @GetMapping("/calculate")
    public String calculate (@RequestParam int fnum, int snum) {
           int sum = fnum + snum;
        return "Sum :" + sum;
    }

}
