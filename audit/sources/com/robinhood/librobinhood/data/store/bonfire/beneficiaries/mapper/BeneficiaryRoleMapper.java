package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRoleDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeneficiaryRoleMapper.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRoleMapper;", "", "<init>", "()V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRoleDto;", "beneficiaryRole", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRole;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryRoleMapper {

    /* compiled from: BeneficiaryRoleMapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeneficiaryRole.values().length];
            try {
                iArr[BeneficiaryRole.BENEFICIARY_ROLE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryRole.BENEFICIARY_ROLE_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeneficiaryRole.BENEFICIARY_ROLE_CONTINGENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final BeneficiaryRoleDto invoke(BeneficiaryRole beneficiaryRole) {
        int i = beneficiaryRole == null ? -1 : WhenMappings.$EnumSwitchMapping$0[beneficiaryRole.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return BeneficiaryRoleDto.BENEFICIARY_ROLE_UNSPECIFIED;
        }
        if (i == 2) {
            return BeneficiaryRoleDto.BENEFICIARY_ROLE_PRIMARY;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BeneficiaryRoleDto.BENEFICIARY_ROLE_CONTINGENT;
    }
}
