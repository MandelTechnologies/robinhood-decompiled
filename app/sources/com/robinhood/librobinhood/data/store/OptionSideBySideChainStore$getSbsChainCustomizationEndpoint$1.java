package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import options_product.service.ChainCustomization;
import options_product.service.SbsChainCustomizationResponseDto;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Loptions_product/service/SbsChainCustomizationResponseDto;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1", m3645f = "OptionSideBySideChainStore.kt", m3646l = {80}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1 extends ContinuationImpl7 implements Function2<Long, Continuation<? super SbsChainCustomizationResponseDto>, Object> {
    int label;
    final /* synthetic */ OptionSideBySideChainStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1(OptionSideBySideChainStore optionSideBySideChainStore, Continuation<? super OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = optionSideBySideChainStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1(this.this$0, continuation);
    }

    public final Object invoke(long j, Continuation<? super SbsChainCustomizationResponseDto> continuation) {
        return ((OptionSideBySideChainStore$getSbsChainCustomizationEndpoint$1) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Long l, Continuation<? super SbsChainCustomizationResponseDto> continuation) {
        return invoke(l.longValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ChainCustomization chainCustomization = this.this$0.chainCustomizationService;
        this.label = 1;
        Object objGetSbsChainCustomization = chainCustomization.GetSbsChainCustomization(this);
        return objGetSbsChainCustomization == coroutine_suspended ? coroutine_suspended : objGetSbsChainCustomization;
    }
}
