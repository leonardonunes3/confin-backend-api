package com.confin.confinbackendapi.service;

import com.confin.confinbackendapi.dto.UserConfigDto;
import com.confin.confinbackendapi.model.UserConfig;

public interface UserConfigService {

    UserConfig create(UserConfigDto userConfigDto);
    UserConfig findById(Long id);
    UserConfig update(UserConfigDto userConfigDto);
    void delete(Long id);
}
