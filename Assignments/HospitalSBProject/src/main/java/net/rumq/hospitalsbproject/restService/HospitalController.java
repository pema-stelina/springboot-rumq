package net.rumq.hospitalsbproject.restService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/app")
@CrossOrigin
public class HospitalController {

    @Autowired
    private HospitalRepository2 hospitalRepository2;

    @GetMapping(value = "/hospital/{id}")
    public ResponseEntity<Hospital> getHospitalByid(@PathVariable long id){
        Hospital hospital = hospitalRepository2.getById(id);
        if (hospital== null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(hospital);
    }
}
