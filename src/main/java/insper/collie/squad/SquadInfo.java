package insper.collie.squad;

import java.io.Serializable;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SquadInfo(
    String id,
    String name,
    String description,
    String company_id,
    String manager_id
) implements Serializable {
    
}
