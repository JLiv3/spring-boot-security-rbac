package org.jlive.rbac.domain.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String roleName;
    @OneToMany(mappedBy = "role")
    private List<UserRoleToPrivilege> userRoleToPrivileges;
}

