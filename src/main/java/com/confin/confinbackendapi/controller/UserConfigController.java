package com.confin.confinbackendapi.controller;

import com.confin.confinbackendapi.dto.UserConfigDto;
import com.confin.confinbackendapi.model.UserConfig;
import com.confin.confinbackendapi.service.UserConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usersConfig")
public class UserConfigController {

    final UserConfigService userConfigService;

    public UserConfigController(UserConfigService userConfigService) {
        this.userConfigService = userConfigService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserConfig> create(@RequestBody UserConfigDto userConfigDto) {
        return ResponseEntity.ok(userConfigService.create(userConfigDto));
    }
}
