package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryRequest;
import bonfire.proto.idl.beneficiaries.p031v1.UpdateBeneficiaryRequestDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryUpdateRequestMapper.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryUpdateRequestMapper;", "", "beneficiaryInfoMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;", "beneficiaryAgreementsMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;)V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequestDto;", "request", "Lbonfire/proto/idl/beneficiaries/v1/UpdateBeneficiaryRequest;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryUpdateRequestMapper {
    private final BeneficiaryAgreementsMapper beneficiaryAgreementsMapper;
    private final BeneficiaryInfoMapper beneficiaryInfoMapper;

    public BeneficiaryUpdateRequestMapper(BeneficiaryInfoMapper beneficiaryInfoMapper, BeneficiaryAgreementsMapper beneficiaryAgreementsMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryInfoMapper, "beneficiaryInfoMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAgreementsMapper, "beneficiaryAgreementsMapper");
        this.beneficiaryInfoMapper = beneficiaryInfoMapper;
        this.beneficiaryAgreementsMapper = beneficiaryAgreementsMapper;
    }

    public final UpdateBeneficiaryRequestDto invoke(UpdateBeneficiaryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new UpdateBeneficiaryRequestDto(request.getAccount_number(), request.getBeneficiary_id(), this.beneficiaryInfoMapper.invoke(request.getBeneficiary_info()), this.beneficiaryAgreementsMapper.invoke(request.getAgreements_to_sign()), request.getAdditional_account_numbers());
    }
}
