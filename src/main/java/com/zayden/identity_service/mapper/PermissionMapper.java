package com.zayden.identity_service.mapper;

import com.zayden.identity_service.dto.request.PermissionRequest;
import com.zayden.identity_service.dto.request.UserCreationRequest;
import com.zayden.identity_service.dto.request.UserUpdateRequest;
import com.zayden.identity_service.dto.response.PermissionResponse;
import com.zayden.identity_service.dto.response.UserResponse;
import com.zayden.identity_service.entity.Permission;
import com.zayden.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
