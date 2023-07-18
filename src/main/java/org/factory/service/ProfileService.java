package org.factory.service;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.factory.repository.DetailRepository;
import org.factory.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
@Getter
@RequiredArgsConstructor
public class ProfileService {

    public DetailRepository detailRepository;
    public ProfileRepository profileRepository;


}
