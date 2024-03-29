package org.example.dtos.word;

import lombok.Data;

import java.util.UUID;

@Data
public class GetWordDto {
    private UUID uuid;
    private UUID dictionaryUuid;
    private String word;
    private String translation;
}
