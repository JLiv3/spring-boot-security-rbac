package org.jlive.rbac.domain.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserToRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private UserAccount user;
    @ManyToOne
    private UserRole role;
}
