package com.AlbertAbuav.SpringFrameworkDemo4.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
@Data
@NoArgsConstructor
public class Chip {
    private String id = UUID.randomUUID().toString();
}
