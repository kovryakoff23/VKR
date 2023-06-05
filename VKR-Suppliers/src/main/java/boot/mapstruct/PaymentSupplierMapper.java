package boot.mapstruct;

import boot.DTO.PaymentSupplierDTO;
import boot.entity.PaymentSupplier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", uses = {SuppliersMapper.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PaymentSupplierMapper {
    @Mapping(source = "paymentSupplier.suppliers", target = "suppliersDTO")
    PaymentSupplierDTO toDTO (PaymentSupplier paymentSupplier);
    @Mapping(source = "paymentSupplierDTO.suppliersDTO", target = "suppliers")
    PaymentSupplier toEntity (PaymentSupplierDTO paymentSupplierDTO);

}
