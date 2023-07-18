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

    private final DetailRepository detailRepository;
    private final ProfileRepository profileRepository;


}
