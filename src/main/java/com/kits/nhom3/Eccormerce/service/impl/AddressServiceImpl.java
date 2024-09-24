package com.kits.nhom3.Eccormerce.service.impl;

import com.kits.nhom3.Eccormerce.entity.Address;
import com.kits.nhom3.Eccormerce.entity.User;
import com.kits.nhom3.Eccormerce.service.interf.AddressService;
import com.kits.nhom3.Eccormerce.service.interf.UserService;
import com.kits.nhom3.Eccormerce.dto.AddressDto;
import com.kits.nhom3.Eccormerce.dto.Response;
import com.kits.nhom3.Eccormerce.repository.AddressRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final UserService userService;


    @Override
    public Response saveAndUpdateAddress(AddressDto addressDto) {
        User user = userService.getLoginUser();
        Address address = user.getAddress();

        if (address == null){
            address = new Address();
            address.setUser(user);
        }
        if (addressDto.getStreet() != null) address.setStreet(addressDto.getStreet());
        if (addressDto.getCity() != null) address.setCity(addressDto.getCity());
        if (addressDto.getState() != null) address.setState(addressDto.getState());
        if (addressDto.getZipCode() != null) address.setZipCode(addressDto.getZipCode());
        if (addressDto.getCountry() != null) address.setCountry(addressDto.getCountry());

        addressRepo.save(address);

        String message = (user.getAddress() == null) ? "Address successfully created" : "Address successfully updated";
        return Response.builder()
                .status(200)
                .message(message)
                .build();
    }
}
