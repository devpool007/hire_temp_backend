package hello;

import Model.Messages;
import SampleData.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataProvider {

    @GetMapping(value = "/getMessages")
    public ResponseEntity<List<Messages>> getMessages(){
        List<Messages> list = Data.getData();
        return new ResponseEntity<List<Messages>>(list, HttpStatus.OK);
    }
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("test",HttpStatus.OK);

    }
}
