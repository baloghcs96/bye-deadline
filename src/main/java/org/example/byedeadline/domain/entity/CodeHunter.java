package org.example.byedeadline.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.byedeadline.domain.enumeration.Experience;
import org.example.byedeadline.domain.enumeration.HardSkills;
import org.example.byedeadline.domain.enumeration.Specialization;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CodeHunter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeHunterId;

    private String name;

    private String position;

    private Experience experience;

    private Specialization specialization;

    private HardSkills hardSkills;

    //TODO: CV upload

    private String summary;
}
