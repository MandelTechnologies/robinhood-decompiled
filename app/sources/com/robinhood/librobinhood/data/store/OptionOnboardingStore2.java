package com.robinhood.librobinhood.data.store;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import options_product.service.GetNextOnboardingScreensRequestDto;
import options_product.service.GetNextOnboardingScreensResponseDto;
import options_product.service.OnboardingService;

/* compiled from: OptionOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "requestDto", "Loptions_product/service/GetNextOnboardingScreensRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOnboardingStore$getNextScreensEndpoint$1", m3645f = "OptionOnboardingStore.kt", m3646l = {43}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStore$getNextScreensEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionOnboardingStore2 extends ContinuationImpl7 implements Function2<GetNextOnboardingScreensRequestDto, Continuation<? super GetNextOnboardingScreensResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingStore2(OptionOnboardingStore optionOnboardingStore, Continuation<? super OptionOnboardingStore2> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingStore2 optionOnboardingStore2 = new OptionOnboardingStore2(this.this$0, continuation);
        optionOnboardingStore2.L$0 = obj;
        return optionOnboardingStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto, Continuation<? super GetNextOnboardingScreensResponseDto> continuation) {
        return ((OptionOnboardingStore2) create(getNextOnboardingScreensRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetNextOnboardingScreensRequestDto getNextOnboardingScreensRequestDto = (GetNextOnboardingScreensRequestDto) this.L$0;
        OnboardingService onboardingService = this.this$0.onboardingService;
        this.label = 1;
        Object objGetNextOnboardingScreens = onboardingService.GetNextOnboardingScreens(getNextOnboardingScreensRequestDto, this);
        return objGetNextOnboardingScreens == coroutine_suspended ? coroutine_suspended : objGetNextOnboardingScreens;
    }
}
