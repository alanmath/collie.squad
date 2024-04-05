package insper.collie.squad;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
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

}