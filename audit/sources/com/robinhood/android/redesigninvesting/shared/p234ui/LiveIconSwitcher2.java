package com.robinhood.android.redesigninvesting.shared.p234ui;

import androidx.compose.runtime.SnapshotIntState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LiveIconSwitcher.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.shared.ui.LiveIconSwitcherKt$IconSwitcher$1$1", m3645f = "LiveIconSwitcher.kt", m3646l = {48}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.shared.ui.LiveIconSwitcherKt$IconSwitcher$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class LiveIconSwitcher2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $currentIndex$delegate;
    final /* synthetic */ ImmutableList<Integer> $icons;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LiveIconSwitcher2(ImmutableList<Integer> immutableList, SnapshotIntState2 snapshotIntState2, Continuation<? super LiveIconSwitcher2> continuation) {
        super(2, continuation);
        this.$icons = immutableList;
        this.$currentIndex$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveIconSwitcher2(this.$icons, this.$currentIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveIconSwitcher2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L25
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            r5.label = r2
            r3 = 700(0x2bc, double:3.46E-321)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            androidx.compose.runtime.MutableIntState r6 = r5.$currentIndex$delegate
            int r1 = com.robinhood.android.redesigninvesting.shared.p234ui.LiveIconSwitcher.access$IconSwitcher$lambda$2(r6)
            int r1 = r1 + r2
            kotlinx.collections.immutable.ImmutableList<java.lang.Integer> r3 = r5.$icons
            int r3 = r3.size()
            int r1 = r1 % r3
            com.robinhood.android.redesigninvesting.shared.p234ui.LiveIconSwitcher.access$IconSwitcher$lambda$3(r6, r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.redesigninvesting.shared.p234ui.LiveIconSwitcher2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
