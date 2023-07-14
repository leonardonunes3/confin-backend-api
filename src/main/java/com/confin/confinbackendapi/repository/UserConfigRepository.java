package com.confin.confinbackendapi.repository;

import com.confin.confinbackendapi.model.UserConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserConfigRepository extends JpaRepository<UserConfig, Long> {
}
