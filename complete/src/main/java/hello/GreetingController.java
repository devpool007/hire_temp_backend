package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @GetMapping(value = "/getMessages")
    public ResponseEntity<List<Messages>> getMessages(){
        List<Messages> list = Data.getData();
        return new ResponseEntity<List<Messages>>(list, HttpStatus.OK);
    }

    @PostMapping(value = "/studDets")
    public ResponseEntity<Student> getStudentByReg(@RequestParam String reg_no){
        return new ResponseEntity<>(Data.getStudentByReg(reg_no),HttpStatus.OK);
    }
}
