package DTO;

import java.util.Set;
import java.util.UUID;

public record BookRecordDTO(
        String title,
        UUID publisherId,
        Set<UUID> authorsID,
        String synopsis
) {
}
