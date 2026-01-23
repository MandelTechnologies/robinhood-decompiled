package com.robinhood.android.lib.margin;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityRequestDto;
import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountEligibilityService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarginEligibilityStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.margin.MarginEligibilityStore$multiAccountMarginEligibilityEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarginEligibilityStore4 extends FunctionReferenceImpl implements Function2<GetMultiAccountEligibilityRequestDto, Continuation<? super GetMultiAccountEligibilityResponseDto>, Object>, ContinuationImpl6 {
    MarginEligibilityStore4(Object obj) {
        super(2, obj, MultiAccountEligibilityService.class, "GetMultiAccountEligibility", "GetMultiAccountEligibility(Lbonfire/proto/idl/margin/v1/GetMultiAccountEligibilityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetMultiAccountEligibilityRequestDto getMultiAccountEligibilityRequestDto, Continuation<? super GetMultiAccountEligibilityResponseDto> continuation) {
        return ((MultiAccountEligibilityService) this.receiver).GetMultiAccountEligibility(getMultiAccountEligibilityRequestDto, continuation);
    }
}
