package com.robinhood.android.advisory.projection.slider;

import androidx.compose.runtime.SnapshotState4;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvisoryAmountSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.projection.slider.AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1", m3645f = "AdvisoryAmountSlider.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes7.dex */
final class AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Money> $currentAmount$delegate;
    final /* synthetic */ Function1<Money, Unit> $onAmountChange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1(Function1<? super Money, Unit> function1, SnapshotState4<Money> snapshotState4, Continuation<? super AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1> continuation) {
        super(2, continuation);
        this.$onAmountChange = function1;
        this.$currentAmount$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1(this.$onAmountChange, this.$currentAmount$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvisoryAmountSliderKt$AdvisoryAmountSlider$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onAmountChange.invoke(AdvisoryAmountSliderKt.AdvisoryAmountSlider_TN_CM5M$lambda$10(this.$currentAmount$delegate));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
