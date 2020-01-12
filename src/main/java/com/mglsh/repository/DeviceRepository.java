package com.mglsh.repository;

import com.mglsh.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long > {
}
