package com.mdh.devtable.ownershop.presentation.dto;

import com.mdh.devtable.shop.ShopAddress;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ShopAddressRequest(

        @NotBlank(message = "주소는 비어 있을 수 없습니다.")
        @Size(max = 127, message = "주소는 최대 127자까지 가능합니다.")
        String address,

        @NotBlank(message = "우편번호는 비어 있을 수 없습니다.")
        @Size(max = 7, message = "우편번호는 최대 7자까지 가능합니다.")
        String zipcode,

        @NotBlank(message = "위도는 비어 있을 수 없습니다.")
        @Size(max = 31, message = "위도는 최대 31자까지 가능합니다.")
        String latitude,

        @NotBlank(message = "경도는 비어 있을 수 없습니다.")
        @Size(max = 31, message = "경도는 최대 31자까지 가능합니다.")
        String longitude
) {
    public ShopAddress toVO() {
        return ShopAddress.builder()
                .address(address)
                .zipcode(zipcode)
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}