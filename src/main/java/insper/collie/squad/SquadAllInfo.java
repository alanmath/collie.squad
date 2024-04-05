package insper.collie.squad;


import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SquadAllInfo(
    String id,
    String name,
    String description,
    String company_id,
    String company_name,
    String company_description,
    String manager_id
) {
    
}
