package com.nguyendacphuc.project.repository;

import com.nguyendacphuc.project.domain.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {
}
