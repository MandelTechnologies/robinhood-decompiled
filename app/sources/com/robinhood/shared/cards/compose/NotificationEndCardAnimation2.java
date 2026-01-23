package com.robinhood.shared.cards.compose;

import androidx.compose.runtime.SnapshotIntState2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationEndCardAnimation.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.cards.compose.NotificationEndCardAnimationKt$NotificationEndCardAnimation$2$1", m3645f = "NotificationEndCardAnimation.kt", m3646l = {85}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.cards.compose.NotificationEndCardAnimationKt$NotificationEndCardAnimation$2$1, reason: use source file name */
/* loaded from: classes26.dex */
final class NotificationEndCardAnimation2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $currentIndex$delegate;
    final /* synthetic */ List<Integer> $imageList;
    final /* synthetic */ boolean $shouldStartAnimation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationEndCardAnimation2(boolean z, List<Integer> list, SnapshotIntState2 snapshotIntState2, Continuation<? super NotificationEndCardAnimation2> continuation) {
        super(2, continuation);
        this.$shouldStartAnimation = z;
        this.$imageList = list;
        this.$currentIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationEndCardAnimation2(this.$shouldStartAnimation, this.$imageList, this.$currentIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationEndCardAnimation2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003a -> B:17:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = r5.$shouldStartAnimation
            if (r6 == 0) goto L48
        L1e:
            androidx.compose.runtime.MutableIntState r6 = r5.$currentIndex$delegate
            int r6 = com.robinhood.shared.cards.compose.NotificationEndCardAnimation.access$NotificationEndCardAnimation_drOMvmE$lambda$1(r6)
            java.util.List<java.lang.Integer> r1 = r5.$imageList
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            int r1 = r1 / 2
            if (r6 != r1) goto L31
            r6 = 400(0x190, float:5.6E-43)
            goto L33
        L31:
            r6 = 25
        L33:
            long r3 = (long) r6
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L3d
            return r0
        L3d:
            androidx.compose.runtime.MutableIntState r6 = r5.$currentIndex$delegate
            int r1 = com.robinhood.shared.cards.compose.NotificationEndCardAnimation.access$NotificationEndCardAnimation_drOMvmE$lambda$1(r6)
            int r1 = r1 + r2
            com.robinhood.shared.cards.compose.NotificationEndCardAnimation.access$NotificationEndCardAnimation_drOMvmE$lambda$2(r6, r1)
            goto L1e
        L48:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.cards.compose.NotificationEndCardAnimation2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
