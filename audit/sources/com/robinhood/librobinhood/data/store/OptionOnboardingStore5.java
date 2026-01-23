package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionsStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow2;
import options_product.service.GetOptionsStatusResponseDto;

/* compiled from: OptionOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "optionsStatusDto", "Loptions_product/service/GetOptionsStatusResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionOnboardingStore$getOptionsStatusEndpoint$2", m3645f = "OptionOnboardingStore.kt", m3646l = {62}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.OptionOnboardingStore$getOptionsStatusEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class OptionOnboardingStore5 extends ContinuationImpl7 implements Function2<GetOptionsStatusResponseDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionOnboardingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionOnboardingStore5(OptionOnboardingStore optionOnboardingStore, Continuation<? super OptionOnboardingStore5> continuation) {
        super(2, continuation);
        this.this$0 = optionOnboardingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OptionOnboardingStore5 optionOnboardingStore5 = new OptionOnboardingStore5(this.this$0, continuation);
        optionOnboardingStore5.L$0 = obj;
        return optionOnboardingStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetOptionsStatusResponseDto getOptionsStatusResponseDto, Continuation<? super Unit> continuation) {
        return ((OptionOnboardingStore5) create(getOptionsStatusResponseDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GetOptionsStatusResponseDto getOptionsStatusResponseDto = (GetOptionsStatusResponseDto) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.optionOnboardingStatusCache;
            OptionsStatus uiModel = OptionOnboardingStore7.toUiModel(getOptionsStatusResponseDto.getStatus());
            this.label = 1;
            if (stateFlow2.emit(uiModel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
