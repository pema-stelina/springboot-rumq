package net.rumq.hospitalsbproject.restServices;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/app")
@CrossOrigin
public class HospitalController {

    private Map<Long, Hospital> hospitalMap = new HashMap<>();
    {
        hospitalMap.put(1L, new Hospital(1L, "Tirana Military Hospital", 150));
        hospitalMap.put(2L, new Hospital(2L, "Mother Teresa Hospital", 200));
        hospitalMap.put(3L, new Hospital(3L, "American Hospital", 100));

    }

    @GetMapping(value = "hospitalV1")
    public Collection<Hospital> getHospitalV1(){
        return hospitalMap.values();
    }

    @GetMapping(value = "hospitalV2")
    public ResponseEntity<Collection<Hospital>> getHospitalV2(){
//        return ResponseEntity.ok().body(hospitalMap.values());
        return ResponseEntity.ok().header("headerName", "headerValue").body(hospitalMap.values());
    }


    @GetMapping(value = "/hospital/{id}")
    public ResponseEntity<Hospital> getHospitalById(@PathVariable long id)
    {
        Hospital hospital = hospitalMap.get(id);

        if (hospital == null)
            return ResponseEntity.notFound().build();
        else
            return ResponseEntity.ok().body(hospital);
    }

    @GetMapping(value = "/hospitals")
    public ResponseEntity<Collection<Hospital>> getHospitalsWithEmployeesCountMoreThan(@RequestParam(value = "min", required = false, defaultValue = "160") int min)
    {
        Collection<Hospital> hospitals = hospitalMap.values()
                .stream()
                .filter(hospital -> hospital.getEmployeeCount() > min)
                .toList();
        return ResponseEntity.ok().body(hospitals);

    }

    @GetMapping(value = "/count")
    public ResponseEntity<Integer> getCount()
    {
        return ResponseEntity.ok().body(hospitalMap.values().size());
    }
}


