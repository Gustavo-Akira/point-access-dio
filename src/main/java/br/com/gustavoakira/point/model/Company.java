package br.com.gustavoakira.point.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Company {
    private Long id;
    private String description;

    @CNPJ
    private String cnpj;

    private String address;

    private String district;

    private String city;

    private String state;

    private String telephone;

}
