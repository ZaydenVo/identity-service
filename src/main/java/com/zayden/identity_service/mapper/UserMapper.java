package com.zayden.identity_service.mapper;

import com.zayden.identity_service.dto.request.UserCreationRequest;
import com.zayden.identity_service.dto.request.UserUpdateRequest;
import com.zayden.identity_service.entity.User;
import com.zayden.identity_service.dto.response.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
