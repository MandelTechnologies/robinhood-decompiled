package com.robinhood.android.eventcontracts.sharedeventui.animation;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MovingDeltasAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$PreviewMovingDeltasAnimation$1$1$1$1", m3645f = "MovingDeltasAnimation.kt", m3646l = {256}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$PreviewMovingDeltasAnimation$1$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MovingDeltasAnimation6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<ImmutableList3<Delta>> $deltas$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MovingDeltasAnimation6(SnapshotState<ImmutableList3<Delta>> snapshotState, Continuation<? super MovingDeltasAnimation6> continuation) {
        super(2, continuation);
        this.$deltas$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MovingDeltasAnimation6(this.$deltas$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MovingDeltasAnimation6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r8)
            goto L25
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
        L1a:
            r7.label = r2
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r3, r7)
            if (r8 != r0) goto L25
            return r0
        L25:
            androidx.compose.runtime.MutableState<kotlinx.collections.immutable.PersistentList<com.robinhood.android.eventcontracts.sharedeventui.animation.Delta>> r8 = r7.$deltas$delegate
            kotlinx.collections.immutable.PersistentList r1 = com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation2.C165971.access$invoke$lambda$4$lambda$1(r8)
            com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$PreviewMovingDeltasAnimation$1$1$1$1$$ExternalSyntheticLambda0 r3 = new com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimationKt$PreviewMovingDeltasAnimation$1$1$1$1$$ExternalSyntheticLambda0
            r3.<init>()
            kotlinx.collections.immutable.PersistentList r1 = r1.removeAll(r3)
            com.robinhood.android.eventcontracts.sharedeventui.animation.Delta r3 = new com.robinhood.android.eventcontracts.sharedeventui.animation.Delta
            kotlin.random.Random$Default r4 = kotlin.random.Random.INSTANCE
            r5 = -1000(0xfffffffffffffc18, float:NaN)
            r6 = 1000(0x3e8, float:1.401E-42)
            int r4 = r4.nextInt(r5, r6)
            r5 = 2
            r6 = 0
            r3.<init>(r4, r6, r5, r6)
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.extensions2.toPersistentList(r1)
            com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation2.C165971.access$invoke$lambda$4$lambda$2(r8, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.eventcontracts.sharedeventui.animation.MovingDeltasAnimation6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Delta delta) {
        return Delta.isComplete$default(delta, null, 1, null);
    }
}
