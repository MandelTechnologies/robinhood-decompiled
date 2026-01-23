package com.robinhood.store.isa;

import bonfire.proto.idl.windsor.p041v1.GetContributionAllowanceV2RequestDto;
import bonfire.proto.idl.windsor.p041v1.GetContributionAllowanceV2ResponseDto;
import bonfire.proto.idl.windsor.p041v1.WindsorService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: IsaContributionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.isa.IsaContributionStore$endpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class IsaContributionStore2 extends FunctionReferenceImpl implements Function2<GetContributionAllowanceV2RequestDto, Continuation<? super GetContributionAllowanceV2ResponseDto>, Object>, ContinuationImpl6 {
    IsaContributionStore2(Object obj) {
        super(2, obj, WindsorService.class, "GetContributionAllowanceV2", "GetContributionAllowanceV2(Lbonfire/proto/idl/windsor/v1/GetContributionAllowanceV2RequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetContributionAllowanceV2RequestDto getContributionAllowanceV2RequestDto, Continuation<? super GetContributionAllowanceV2ResponseDto> continuation) {
        return ((WindsorService) this.receiver).GetContributionAllowanceV2(getContributionAllowanceV2RequestDto, continuation);
    }
}
