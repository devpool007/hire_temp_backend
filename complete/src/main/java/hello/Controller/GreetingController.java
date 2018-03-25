package hello.Controller;

import java.util.List;

import Model.Company;
import Model.Messages;
import Model.Student;
import hello.DataProvider.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @GetMapping(value = "/getMessages")
    public ResponseEntity<List<Messages>> getMessages(){
        List<Messages> list = Data.getData();
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        return new ResponseEntity<List<Messages>>(list, HttpStatus.OK);
    }

    @PostMapping(value = "/studDets")
    public ResponseEntity<Student> getStudentByReg(@RequestParam String reg_no){
        Student st = Data.getStudentByReg(reg_no);

        return new ResponseEntity<>(Data.getStudentByReg(reg_no),st == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }

    @PostMapping(value = "/getCompanies")
    public ResponseEntity<List<Company>> getCompanies(){
        try {
            long time = 4000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        List<Company> list = Data.getCompanies();
        return new ResponseEntity<>(list,list == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK);

    }

}
