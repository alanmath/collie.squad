package insper.collie.squad;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SquadInfo(
    String id,
    String name,
    String description,
    String companyId,
    String manager_id
) {
    
}
