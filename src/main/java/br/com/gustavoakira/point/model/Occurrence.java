package br.com.gustavoakira.point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
public class Occurrence {
    @Id
    private Long id;
    private String description;
    private String name;
}
