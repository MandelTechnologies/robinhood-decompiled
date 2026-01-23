package com.robinhood.android.common.portfolio.pnl;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PnlHubSectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$2", m3645f = "PnlHubSectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$2, reason: use source file name */
/* loaded from: classes2.dex */
final class PnlHubSectionDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ PnlHubSectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PnlHubSectionDuxo4(PnlHubSectionDuxo pnlHubSectionDuxo, Continuation<? super PnlHubSectionDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = pnlHubSectionDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PnlHubSectionDuxo4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PnlHubSectionDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
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
            goto L2d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
        L1a:
            com.robinhood.android.portfolio.pnl.db.ProfitAndLossRealized$Companion r6 = com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossRealized.INSTANCE
            j$.time.Duration r6 = r6.getNormalStaleTimeout()
            long r3 = r6.toMillis()
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r5)
            if (r6 != r0) goto L2d
            return r0
        L2d:
            com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo r6 = r5.this$0
            kotlinx.coroutines.flow.StateFlow r6 = r6.getStateFlow()
            java.lang.Object r6 = r6.getValue()
            boolean r1 = r6 instanceof com.robinhood.android.common.portfolio.pnl.PnlHubSectionViewState
            r3 = 0
            if (r1 == 0) goto L3f
            com.robinhood.android.common.portfolio.pnl.PnlHubSectionViewState r6 = (com.robinhood.android.common.portfolio.pnl.PnlHubSectionViewState) r6
            goto L40
        L3f:
            r6 = r3
        L40:
            if (r6 == 0) goto L1a
            com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo r1 = r5.this$0
            com.robinhood.android.portfolio.pnl.db.ProfitAndLossRealized r4 = r6.getRealizedPnl()
            if (r4 == 0) goto L1a
            j$.time.Instant r4 = r4.getReceivedAt()
            boolean r4 = com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo.access$checkIfDataIsStale(r1, r4)
            boolean r6 = r6.isStale()
            if (r4 == r6) goto L1a
            com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$2$1$1$1 r6 = new com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo$bind$2$1$1$1
            r6.<init>(r4, r3)
            com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo.access$applyMutation(r1, r6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.portfolio.pnl.PnlHubSectionDuxo4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
