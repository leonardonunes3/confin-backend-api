package com.confin.confinbackendapi.service.impl;

import com.confin.confinbackendapi.dto.UserConfigDto;
import com.confin.confinbackendapi.model.User;
import com.confin.confinbackendapi.model.UserConfig;
import com.confin.confinbackendapi.repository.UserConfigRepository;
import com.confin.confinbackendapi.repository.UserRepository;
import com.confin.confinbackendapi.service.UserConfigService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserConfigServiceImpl implements UserConfigService {

    final UserConfigRepository userConfigRepository;

    final UserRepository userRepository;

    public UserConfigServiceImpl(UserConfigRepository userConfigRepository, UserRepository userRepository) {
        this.userConfigRepository = userConfigRepository;
        this.userRepository =  userRepository;
    }

    @Override
    public UserConfig create(UserConfigDto userConfigDto) {
        UserConfig userConfig = new UserConfig();
        User user = userRepository.findById(userConfigDto.getUserId())
                .orElseThrow(
                        ()-> new EntityNotFoundException(
                                String.format(
                                        "User with id [%d] was not found!",
                                        userConfigDto.getUserId()
                                ))
                );


        userConfig.setDueDate(userConfigDto.getDueDate());
        userConfig.setClosingDate(userConfigDto.getClosingDate());
        userConfig.setExpenseGoal(userConfigDto.getExpenseGoal());
        userConfig.setBeginDate(userConfigDto.getBeginDate());
        userConfig.setEndDate(userConfigDto.getEndDate());
        userConfig.setUser(user);

        return userConfigRepository.save(userConfig);
    }

    @Override
    public UserConfig findById(Long id) {
        return userConfigRepository.findById(id)
                .orElseThrow(
                        ()-> new EntityNotFoundException(
                                String.format(
                                        "UserConfig with id [%d] was not found!",
                                        id
                                ))
                );
    }

    @Override
    public UserConfig update(UserConfigDto userConfigDto) {
        /*
         * TO-DO: Implement later
         * */
        return null;
    }

    @Override
    public void delete(Long id) {
        userConfigRepository.deleteById(id);
    }
}
