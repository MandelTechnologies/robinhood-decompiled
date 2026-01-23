package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequest;
import bonfire.proto.idl.beneficiaries.p031v1.CreateBeneficiaryRequestDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateRequestMapper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateRequestMapper;", "", "beneficiaryInfoMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;", "beneficiaryAgreementsMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;", "beneficiaryRoleMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRoleMapper;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRoleMapper;)V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequestDto;", "request", "Lbonfire/proto/idl/beneficiaries/v1/CreateBeneficiaryRequest;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryCreateRequestMapper {
    private final BeneficiaryAgreementsMapper beneficiaryAgreementsMapper;
    private final BeneficiaryInfoMapper beneficiaryInfoMapper;
    private final BeneficiaryRoleMapper beneficiaryRoleMapper;

    public BeneficiaryCreateRequestMapper(BeneficiaryInfoMapper beneficiaryInfoMapper, BeneficiaryAgreementsMapper beneficiaryAgreementsMapper, BeneficiaryRoleMapper beneficiaryRoleMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryInfoMapper, "beneficiaryInfoMapper");
        Intrinsics.checkNotNullParameter(beneficiaryAgreementsMapper, "beneficiaryAgreementsMapper");
        Intrinsics.checkNotNullParameter(beneficiaryRoleMapper, "beneficiaryRoleMapper");
        this.beneficiaryInfoMapper = beneficiaryInfoMapper;
        this.beneficiaryAgreementsMapper = beneficiaryAgreementsMapper;
        this.beneficiaryRoleMapper = beneficiaryRoleMapper;
    }

    public final CreateBeneficiaryRequestDto invoke(CreateBeneficiaryRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateBeneficiaryRequestDto(request.getAccount_number(), this.beneficiaryInfoMapper.invoke(request.getBeneficiary_info()), this.beneficiaryAgreementsMapper.invoke(request.getAgreements_to_sign()), request.getAdditional_account_numbers(), this.beneficiaryRoleMapper.invoke(request.getBeneficiary_role()));
    }
}
