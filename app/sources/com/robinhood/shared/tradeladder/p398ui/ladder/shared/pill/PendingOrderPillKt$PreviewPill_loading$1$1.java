package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PendingOrderPill.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.PendingOrderPillKt$PreviewPill_loading$1$1", m3645f = "PendingOrderPill.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PendingOrderPillKt$PreviewPill_loading$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $showLoadingShimmer$delegate;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PendingOrderPillKt$PreviewPill_loading$1$1(SnapshotState<Boolean> snapshotState, Continuation<? super PendingOrderPillKt$PreviewPill_loading$1$1> continuation) {
        super(2, continuation);
        this.$showLoadingShimmer$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PendingOrderPillKt$PreviewPill_loading$1$1(this.$showLoadingShimmer$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PendingOrderPillKt$PreviewPill_loading$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0046). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        SnapshotState<Boolean> snapshotState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            i = Integer.MAX_VALUE;
            i2 = 0;
            snapshotState = this.$showLoadingShimmer$delegate;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$1;
            i = this.I$0;
            snapshotState = (SnapshotState) this.L$0;
            ResultKt.throwOnFailure(obj);
            PendingOrderPillKt.PreviewPill_loading$lambda$16(snapshotState, !PendingOrderPillKt.PreviewPill_loading$lambda$15(snapshotState));
            i2++;
            if (i2 < i) {
                Duration.Companion companion = Duration.INSTANCE;
                long duration = Duration3.toDuration(2, DurationUnitJvm.SECONDS);
                this.L$0 = snapshotState;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (DelayKt.m28786delayVtjQ1oo(duration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PendingOrderPillKt.PreviewPill_loading$lambda$16(snapshotState, !PendingOrderPillKt.PreviewPill_loading$lambda$15(snapshotState));
                i2++;
                if (i2 < i) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
