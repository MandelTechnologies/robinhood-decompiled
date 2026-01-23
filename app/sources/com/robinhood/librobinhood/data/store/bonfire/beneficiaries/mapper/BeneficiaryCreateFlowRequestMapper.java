package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryType;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryTypeDto;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowRequest;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowRequestDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateFlowRequestMapper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryCreateFlowRequestMapper;", "", "beneficiaryRoleMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRoleMapper;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRoleMapper;)V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequestDto;", "request", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowRequest;", "map", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryTypeDto;", "beneficiaryType", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryType;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryCreateFlowRequestMapper {
    private final BeneficiaryRoleMapper beneficiaryRoleMapper;

    /* compiled from: BeneficiaryCreateFlowRequestMapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeneficiaryType.values().length];
            try {
                iArr[BeneficiaryType.BENEFICIARY_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryType.BENEFICIARY_TYPE_INDIVIDUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeneficiaryType.BENEFICIARY_TYPE_TRUST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BeneficiaryCreateFlowRequestMapper(BeneficiaryRoleMapper beneficiaryRoleMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryRoleMapper, "beneficiaryRoleMapper");
        this.beneficiaryRoleMapper = beneficiaryRoleMapper;
    }

    public final GetBeneficiaryFlowRequestDto invoke(GetBeneficiaryFlowRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new GetBeneficiaryFlowRequestDto(request.getAccount_number(), request.getBeneficiary_id(), map(request.getBeneficiary_type()), this.beneficiaryRoleMapper.invoke(request.getBeneficiary_role()));
    }

    private final BeneficiaryTypeDto map(BeneficiaryType beneficiaryType) {
        int i = beneficiaryType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[beneficiaryType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return BeneficiaryTypeDto.BENEFICIARY_TYPE_UNSPECIFIED;
        }
        if (i == 2) {
            return BeneficiaryTypeDto.BENEFICIARY_TYPE_INDIVIDUAL;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BeneficiaryTypeDto.BENEFICIARY_TYPE_TRUST;
    }
}
