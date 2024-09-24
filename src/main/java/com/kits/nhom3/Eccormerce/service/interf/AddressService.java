package com.kits.nhom3.Eccormerce.service.interf;

import com.kits.nhom3.Eccormerce.dto.AddressDto;
import com.kits.nhom3.Eccormerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
