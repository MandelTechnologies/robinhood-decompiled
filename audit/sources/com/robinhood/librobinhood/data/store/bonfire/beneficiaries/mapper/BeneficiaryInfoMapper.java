package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfo;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoDto;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryInfo;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryInfoDto;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryInfo;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryInfoDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryInfoMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryInfoMapper;", "", "beneficiaryRelationshipMapper", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRelationshipMapper;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryRelationshipMapper;)V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoDto;", "beneficiaryInfo", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfo;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryInfoMapper {
    private final BeneficiaryRelationshipMapper beneficiaryRelationshipMapper;

    public BeneficiaryInfoMapper(BeneficiaryRelationshipMapper beneficiaryRelationshipMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryRelationshipMapper, "beneficiaryRelationshipMapper");
        this.beneficiaryRelationshipMapper = beneficiaryRelationshipMapper;
    }

    public final BeneficiaryInfoDto invoke(BeneficiaryInfo beneficiaryInfo) {
        String date_of_birth;
        String email;
        String last_name;
        String first_name;
        String organization_name;
        String tax_id;
        String formation_date;
        String email2;
        String str = "";
        if ((beneficiaryInfo != null ? beneficiaryInfo.getTrust_info() : null) != null) {
            TrustBeneficiaryInfo trust_info = beneficiaryInfo.getTrust_info();
            if (trust_info == null || (organization_name = trust_info.getOrganization_name()) == null) {
                organization_name = "";
            }
            TrustBeneficiaryInfo trust_info2 = beneficiaryInfo.getTrust_info();
            if (trust_info2 == null || (tax_id = trust_info2.getTax_id()) == null) {
                tax_id = "";
            }
            TrustBeneficiaryInfo trust_info3 = beneficiaryInfo.getTrust_info();
            if (trust_info3 == null || (formation_date = trust_info3.getFormation_date()) == null) {
                formation_date = "";
            }
            TrustBeneficiaryInfo trust_info4 = beneficiaryInfo.getTrust_info();
            if (trust_info4 != null && (email2 = trust_info4.getEmail()) != null) {
                str = email2;
            }
            return new BeneficiaryInfoDto(new BeneficiaryInfoDto.AbstractC49483BeneficiaryInfoDto.TrustInfo(new TrustBeneficiaryInfoDto(organization_name, tax_id, formation_date, str)));
        }
        if ((beneficiaryInfo != null ? beneficiaryInfo.getIndividual_info() : null) != null) {
            IndividualBeneficiaryInfo individual_info = beneficiaryInfo.getIndividual_info();
            String str2 = (individual_info == null || (first_name = individual_info.getFirst_name()) == null) ? "" : first_name;
            IndividualBeneficiaryInfo individual_info2 = beneficiaryInfo.getIndividual_info();
            String str3 = (individual_info2 == null || (last_name = individual_info2.getLast_name()) == null) ? "" : last_name;
            IndividualBeneficiaryInfo individual_info3 = beneficiaryInfo.getIndividual_info();
            String str4 = (individual_info3 == null || (email = individual_info3.getEmail()) == null) ? "" : email;
            IndividualBeneficiaryInfo individual_info4 = beneficiaryInfo.getIndividual_info();
            String str5 = (individual_info4 == null || (date_of_birth = individual_info4.getDate_of_birth()) == null) ? "" : date_of_birth;
            BeneficiaryRelationshipMapper beneficiaryRelationshipMapper = this.beneficiaryRelationshipMapper;
            IndividualBeneficiaryInfo individual_info5 = beneficiaryInfo.getIndividual_info();
            return new BeneficiaryInfoDto(new BeneficiaryInfoDto.AbstractC49483BeneficiaryInfoDto.IndividualInfo(new IndividualBeneficiaryInfoDto(str2, str3, str5, beneficiaryRelationshipMapper.invoke(individual_info5 != null ? individual_info5.getRelationship() : null), str4)));
        }
        throw new IllegalStateException("beneficiary info should be presented");
    }
}
