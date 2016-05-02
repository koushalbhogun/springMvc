package com.share.car.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.share.car.entities.Role;



public interface RoleRepository extends JpaRepository<Role, Serializable>
{

}
