package com.capstone.onda.domain.roomType.util;

import com.capstone.onda.domain.roomType.dto.response.RoomTypeEditResponse;
import com.capstone.onda.domain.roomType.dto.response.RoomTypePostResponse;
import com.capstone.onda.domain.roomType.dto.response.RoomTypeResponse;
import com.capstone.onda.domain.roomType.entity.RoomType;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomTypeMapper {

    public static RoomTypePostResponse toRoomTypePostResponse(Long hotelId, RoomType roomType) {
        return RoomTypePostResponse.builder()
                .hotelId(hotelId)
                .roomTypeId(roomType.getId())
                .roomTypeName(roomType.getRoomTypeCategory())
                .totalRoom(roomType.getTotalRoom())
                .facilityOptions(roomType.getFacilityOptions())
                .attractionOptions(roomType.getAttractionOptions())
                .serviceOptions(roomType.getServiceOptions())
                .amenityOptions(roomType.getAmenityOptions())
                .build();
    }

    public static RoomTypeResponse toRoomTypeResponse(Long hotelId, RoomType roomType) {
        return RoomTypeResponse.builder()
                .hotelId(hotelId)
                .roomTypeId(roomType.getId())
                .roomTypeName(roomType.getRoomTypeCategory())
                .totalRoom(roomType.getTotalRoom())
                .facilityOptions(roomType.getFacilityOptions())
                .attractionOptions(roomType.getAttractionOptions())
                .serviceOptions(roomType.getServiceOptions())
                .amenityOptions(roomType.getAmenityOptions())
                .build();
    }

    public static RoomTypeEditResponse toRoomTypeEditResponse(Long hotelId, RoomType roomType) {
        return RoomTypeEditResponse.builder()
                .hotelId(hotelId)
                .roomTypeId(roomType.getId())
                .roomTypeName(roomType.getRoomTypeCategory())
                .totalRoom(roomType.getTotalRoom())
                .facilityOptions(roomType.getFacilityOptions())
                .attractionOptions(roomType.getAttractionOptions())
                .serviceOptions(roomType.getServiceOptions())
                .amenityOptions(roomType.getAmenityOptions())
                .build();
    }
}
