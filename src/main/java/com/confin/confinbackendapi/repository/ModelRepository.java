package com.confin.confinbackendapi.repository;

import com.confin.confinbackendapi.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {
}
