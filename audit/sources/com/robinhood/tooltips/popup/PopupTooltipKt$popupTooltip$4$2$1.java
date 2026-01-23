package com.robinhood.tooltips.popup;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PopupTooltip.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.tooltips.popup.PopupTooltipKt$popupTooltip$4$2$1", m3645f = "PopupTooltip.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PopupTooltipKt$popupTooltip$4$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Duration $closeAfter;
    final /* synthetic */ SnapshotState<Boolean> $display$delegate;
    final /* synthetic */ Duration $initialDisplayDelay;
    final /* synthetic */ SnapshotState<Boolean> $isClosedAfterDelay$delegate;
    final /* synthetic */ SnapshotState4<Function0<Unit>> $latestOnAutoClose$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PopupTooltipKt$popupTooltip$4$2$1(Duration duration, Duration duration2, SnapshotState<Boolean> snapshotState, SnapshotState4<? extends Function0<Unit>> snapshotState4, SnapshotState<Boolean> snapshotState2, Continuation<? super PopupTooltipKt$popupTooltip$4$2$1> continuation) {
        super(2, continuation);
        this.$initialDisplayDelay = duration;
        this.$closeAfter = duration2;
        this.$display$delegate = snapshotState;
        this.$latestOnAutoClose$delegate = snapshotState4;
        this.$isClosedAfterDelay$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PopupTooltipKt$popupTooltip$4$2$1(this.$initialDisplayDelay, this.$closeAfter, this.$display$delegate, this.$latestOnAutoClose$delegate, this.$isClosedAfterDelay$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PopupTooltipKt$popupTooltip$4$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (kotlinx.coroutines.DelayKt.m28786delayVtjQ1oo(r4, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Duration duration = this.$initialDisplayDelay;
            if (duration != null) {
                long rawValue = duration.getRawValue();
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(rawValue, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PopupTooltipKt$popupTooltip$4.invoke$lambda$17(this.$latestOnAutoClose$delegate).invoke();
            PopupTooltipKt$popupTooltip$4.invoke$lambda$8(this.$isClosedAfterDelay$delegate, true);
            PopupTooltipKt$popupTooltip$4.invoke$lambda$11(this.$display$delegate, false);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        PopupTooltipKt$popupTooltip$4.invoke$lambda$11(this.$display$delegate, true);
        Duration duration2 = this.$closeAfter;
        if (duration2 != null) {
            long rawValue2 = duration2.getRawValue();
            this.label = 2;
        }
        return Unit.INSTANCE;
    }
}
