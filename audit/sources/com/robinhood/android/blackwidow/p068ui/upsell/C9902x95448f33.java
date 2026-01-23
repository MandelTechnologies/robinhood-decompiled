package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$ExploreLegendUpsellComposable$1$1", m3645f = "ExploreLegendUpsellComposable.kt", m3646l = {147}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$ExploreLegendUpsellComposable$1$1 */
/* loaded from: classes7.dex */
final class C9902x95448f33 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $continueToShowLoading$delegate;
    final /* synthetic */ long $minimumLoadingAnimationTime;
    final /* synthetic */ long $startedDisplayAt;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9902x95448f33(long j, long j2, SnapshotState<Boolean> snapshotState, Continuation<? super C9902x95448f33> continuation) {
        super(2, continuation);
        this.$startedDisplayAt = j;
        this.$minimumLoadingAnimationTime = j2;
        this.$continueToShowLoading$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C9902x95448f33(this.$startedDisplayAt, this.$minimumLoadingAnimationTime, this.$continueToShowLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C9902x95448f33) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long jCoerceAtLeast = RangesKt.coerceAtLeast(this.$minimumLoadingAnimationTime - (System.currentTimeMillis() - this.$startedDisplayAt), 0L);
            this.label = 1;
            if (DelayKt.delay(jCoerceAtLeast, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ExploreLegendUpsellComposableKt.ExploreLegendUpsellComposable$lambda$3(this.$continueToShowLoading$delegate, false);
        return Unit.INSTANCE;
    }
}
