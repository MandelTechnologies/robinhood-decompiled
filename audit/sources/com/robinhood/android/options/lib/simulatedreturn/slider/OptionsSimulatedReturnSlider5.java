package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsSimulatedReturnSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnSlider$1$1", m3645f = "OptionsSimulatedReturnSlider.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnSlider$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSimulatedReturnSlider5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionsSimulatedReturnPriceSliderDuxo $duxo;
    final /* synthetic */ OptionsSimulatedReturnSliderLaunchMode $launchMode;
    final /* synthetic */ OptionsSimulatedReturnLoggingState $loggingState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionsSimulatedReturnSlider5(OptionsSimulatedReturnPriceSliderDuxo optionsSimulatedReturnPriceSliderDuxo, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, Continuation<? super OptionsSimulatedReturnSlider5> continuation) {
        super(2, continuation);
        this.$duxo = optionsSimulatedReturnPriceSliderDuxo;
        this.$launchMode = optionsSimulatedReturnSliderLaunchMode;
        this.$loggingState = optionsSimulatedReturnLoggingState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsSimulatedReturnSlider5(this.$duxo, this.$launchMode, this.$loggingState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsSimulatedReturnSlider5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$duxo.bind((OptionsSimulatedReturnSliderLaunchMode.Price) this.$launchMode, this.$loggingState);
        return Unit.INSTANCE;
    }
}
