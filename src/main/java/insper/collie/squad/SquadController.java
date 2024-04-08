package insper.collie.squad;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@FeignClient(name = "collie-squad")
public interface SquadController {

    @PostMapping("/squad")
    ResponseEntity<SquadInfo> create(@RequestBody SquadInfo in);

    @GetMapping("/squad/{id}")
    ResponseEntity<SquadAllInfo> getSquad(@PathVariable String id);

    @GetMapping("/squad/exists/{id}")
    ResponseEntity<Boolean> isSquad(@PathVariable String id);

    @GetMapping("/squad")
    ResponseEntity<List<SquadInfo>> getAllSquads();

    @PutMapping("/squad/{id}")
    ResponseEntity<SquadInfo> updateSquad(@PathVariable String id, @RequestBody SquadInfo in);

    @DeleteMapping("/squad/{id}")
    ResponseEntity<SquadInfo> deleteSquad(@PathVariable String id);
}