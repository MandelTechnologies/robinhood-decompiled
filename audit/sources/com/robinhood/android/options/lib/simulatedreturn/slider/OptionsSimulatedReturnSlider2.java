package com.robinhood.android.options.lib.simulatedreturn.slider;

import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionsSimulatedReturnSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$1$1", m3645f = "OptionsSimulatedReturnSlider.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderKt$OptionsSimulatedReturnBaseSlider$1$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionsSimulatedReturnSlider2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Double, Unit> $onSnappedPointerPositionUpdated;
    final /* synthetic */ SnapshotState4<OptionsSimulatedReturnSliderViewState> $sliderState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OptionsSimulatedReturnSlider2(SnapshotState4<OptionsSimulatedReturnSliderViewState> snapshotState4, Function1<? super Double, Unit> function1, Continuation<? super OptionsSimulatedReturnSlider2> continuation) {
        super(2, continuation);
        this.$sliderState$delegate = snapshotState4;
        this.$onSnappedPointerPositionUpdated = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionsSimulatedReturnSlider2(this.$sliderState$delegate, this.$onSnappedPointerPositionUpdated, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionsSimulatedReturnSlider2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Double snappedPointerPosition = OptionsSimulatedReturnSlider.OptionsSimulatedReturnBaseSlider_lVb_Clg$lambda$5(this.$sliderState$delegate).getSnappedPointerPosition();
            if (snappedPointerPosition != null) {
                this.$onSnappedPointerPositionUpdated.invoke(boxing.boxDouble(snappedPointerPosition.doubleValue()));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
