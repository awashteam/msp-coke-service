package guru.springframework.mspcokeservice.web.controller;

import guru.springframework.mspcokeservice.web.model.CokeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/coke")
@RestController
public class CokeController {

    @GetMapping("/{cokeId}")
    public ResponseEntity<CokeDto> getCokeById(@PathVariable("cokeId") UUID cokeId){
        // todo impl
        return new ResponseEntity<>(CokeDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewCoke(@RequestBody CokeDto cokeDto){
        // todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{cokeId}")
    public ResponseEntity updateCokeById(@PathVariable("cokeId") UUID cokeId, @RequestBody CokeDto cokeDto) {
        // todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
