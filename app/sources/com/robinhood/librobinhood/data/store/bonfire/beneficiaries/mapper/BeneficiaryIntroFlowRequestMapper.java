package com.robinhood.librobinhood.data.store.bonfire.beneficiaries.mapper;

import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsRequest;
import bonfire.proto.idl.beneficiaries.p031v1.GetBeneficiaryFlowIntroViewModelsRequestDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryIntroFlowRequestMapper.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/mapper/BeneficiaryIntroFlowRequestMapper;", "", "<init>", "()V", "invoke", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsRequestDto;", "request", "Lbonfire/proto/idl/beneficiaries/v1/GetBeneficiaryFlowIntroViewModelsRequest;", "lib-store-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BeneficiaryIntroFlowRequestMapper {
    public final GetBeneficiaryFlowIntroViewModelsRequestDto invoke(GetBeneficiaryFlowIntroViewModelsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new GetBeneficiaryFlowIntroViewModelsRequestDto(request.getAccount_number());
    }
}
