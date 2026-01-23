package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRelationship;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRelationshipDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeneficiaryRelationshipMapper.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRelationshipMapper;", "", "<init>", "()V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationshipDto;", "relationship", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryRelationship;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryRelationshipMapper {

    /* compiled from: BeneficiaryRelationshipMapper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeneficiaryRelationship.values().length];
            try {
                iArr[BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_SPOUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final BeneficiaryRelationshipDto invoke(BeneficiaryRelationship relationship) {
        int i = relationship == null ? -1 : WhenMappings.$EnumSwitchMapping$0[relationship.ordinal()];
        if (i == -1 || i == 1) {
            return BeneficiaryRelationshipDto.BENEFICIARY_RELATIONSHIP_UNSPECIFIED;
        }
        if (i == 2) {
            return BeneficiaryRelationshipDto.BENEFICIARY_RELATIONSHIP_OTHER;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BeneficiaryRelationshipDto.BENEFICIARY_RELATIONSHIP_SPOUSE;
    }
}
