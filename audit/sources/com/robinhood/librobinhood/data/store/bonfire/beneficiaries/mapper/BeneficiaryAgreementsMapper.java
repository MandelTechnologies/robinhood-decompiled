package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiarySignedAgreement;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiarySignedAgreementDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BeneficiaryAgreementsMapper.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0086\u0002¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryAgreementsMapper;", "", "<init>", "()V", "invoke", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiarySignedAgreementDto;", "list", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiarySignedAgreement;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class BeneficiaryAgreementsMapper {
    public final List<BeneficiarySignedAgreementDto> invoke(List<BeneficiarySignedAgreement> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<BeneficiarySignedAgreement> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new BeneficiarySignedAgreementDto(((BeneficiarySignedAgreement) it.next()).getAgreement_type()));
        }
        return arrayList;
    }
}
