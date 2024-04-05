package insper.collie.squad;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "collie-squad")
public interface SquadController {

    @PostMapping("/squad")
    public ResponseEntity<SquadInfo> create(
        @RequestBody(required = true) SquadInfo in
    );

    
    @GetMapping("/squad/{id}")
    public ResponseEntity<SquadInfo> getSquad(
        @PathVariable(required = true) String id
    );

    @GetMapping("/squad")
    public ResponseEntity<List<SquadInfo>> getAllSquads();


    @PutMapping("/squad/{id}")
    public ResponseEntity<SquadInfo> updateSquad(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) SquadInfo in
    );

    @DeleteMapping("/squad/{id}")
    public ResponseEntity<SquadInfo> deleteSquad(
        @PathVariable(required = true) String id
    );

}